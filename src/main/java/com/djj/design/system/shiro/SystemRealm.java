package com.djj.design.system.shiro;

import com.djj.design.common.utils.JWTUtil;
import com.djj.design.system.bean.UserBean;
import com.djj.design.system.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author GDDX00045
 */
public class SystemRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;


    /**
     * 权限
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        String username = JWTUtil.getUsername(principals.toString());
        UserBean user = userService.getUser(username);
        SimpleAuthorizationInfo simpleAuthorizationInfo = new SimpleAuthorizationInfo();
        simpleAuthorizationInfo.addRole(user.getRole());
        Set<String> permission = new HashSet<>(Arrays.asList(user.getPermission().split(",")));
        simpleAuthorizationInfo.addStringPermissions(permission);
        return simpleAuthorizationInfo;
    }


    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken auth) throws AuthenticationException {

        //是否登录（持有jwt token）
        boolean isLogin = auth instanceof JWTToken;
        if (!isLogin) {
            SimpleAuthenticationInfo info = null;
            //1.将token 转成usernamepasswordtoken
            UsernamePasswordToken upToken = (UsernamePasswordToken) auth;
            //2.获取用户名
            String username = upToken.getUsername();
            //3.查询数据库 账号密码
            //查到了 ，返回结果；没查到抛出异常
            try {
                UserBean user = userService.getUser(username);
                if (user != null) {
                    Object principal = username;
                    Object credentials = user.getPassword();
                    String realmName = this.getName();
                    ByteSource credentialsSalt = ByteSource.Util.bytes(user.getUsername());
                    info = new SimpleAuthenticationInfo(principal, credentials, credentialsSalt, realmName);

                } else {
                    throw new AuthenticationException();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }

            return info;
        }
        String token = (String) auth.getCredentials();
        // 解密获得username，用于和数据库进行对比
        String username = JWTUtil.getUsername(token);
        if (username == null) {
            throw new AuthenticationException("token invalid");
        }
        UserBean userBean = userService.getUser(username);
        if (userBean == null) {
            throw new AuthenticationException("User didn't existed!");
        }
        if (!JWTUtil.verify(token, username, userBean.getPassword())) {
            throw new AuthenticationException("Username or password error");
        }
        return new SimpleAuthenticationInfo(token, token, "my_realm");

    }


    public static void main(String[] args) {
        UserBean user=new UserBean() ;
        user.setUsername("djj");
        user.setPassword("123456");
        user.setRole("1,2,3");
        user.setPermission("1,2,3");
        SimpleHash hash = new SimpleHash("MD5", user.getPassword(), ByteSource.Util.bytes(user.getUsername()), 1024);
        String hex = hash.toHex();
        System.out.println(hex);

    }
}
