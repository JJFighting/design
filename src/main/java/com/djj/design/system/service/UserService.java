package com.djj.design.system.service;

import com.djj.design.system.bean.UserBean;
import org.springframework.stereotype.Service;

/**
 * @author GDDX00045
 */
@Service
public class UserService {

    public UserBean getUser(String username) {
        UserBean user = new UserBean();

        user.setUsername(username);
        user.setPassword("8733533c20e2aea753ebfb959eecbe16");
        user.setRole("1,2,3");
        user.setPermission("1,2,3");
        return user;
    }
}
