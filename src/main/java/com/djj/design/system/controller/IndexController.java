package com.djj.design.system.controller;

import com.djj.design.system.exception.SysException;
import com.djj.design.system.exception.SysExceptionEnum;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author GDDX00045
 */
@Controller
public class IndexController {

    @GetMapping("/hello")
    public String hello() {
        throw new SysException(SysExceptionEnum.ACCOUNT_FREEZED);
//        return "hello";
    }
}
