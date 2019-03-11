package com.djj.design.system.controller;

import com.djj.design.common.ResponseBean;
import com.djj.design.common.utils.JWTUtil;
import com.djj.design.system.form.UserForm;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GDDX00045
 */
@RestController
public class LoginController {

    @PostMapping(value = "/login",produces = "application/json")
    public ResponseBean login(@RequestBody UserForm userForm){
        UsernamePasswordToken token=new UsernamePasswordToken(userForm.getUsername(),userForm.getPassword(),userForm.getRememberMe());
        //获取当前的Subject
        Subject currentUser = SecurityUtils.getSubject();

        String msg = null;
        try {
            currentUser.login(token);
        } catch (UnknownAccountException e) {
            msg = "用户名/密码错误";
        } catch (IncorrectCredentialsException e) {
            msg = "用户名/密码错误";
        } catch (ExcessiveAttemptsException e) {
            msg = "登录失败多次，账户锁定10分钟";
        } catch (AuthenticationException e) {
            // 其他错误，比如锁定，如果想单独处理请单独catch处理
            e.printStackTrace();
            msg = "其他错误：" + e.getMessage();
        }
        if (msg != null) {
            return ResponseBean.ERROR(msg);
        } else {// 登录成功
            msg = "登录成功";
            return ResponseBean.SUCCESS(msg,JWTUtil.sign(userForm.getUsername(),userForm.getPassword()));
        }

    }
}
