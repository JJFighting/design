package com.djj.design.system.ExceptionHandler;

import com.djj.design.system.exception.SysException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @author GDDX00045
 */
@ControllerAdvice
public class SysExceptionHandler {

    @ResponseBody
    @ExceptionHandler
    public Map<String, Object> handleException(SysException e, HttpServletRequest request){
//        request.setAttribute("javax.servlet.error.status_code",500);
        Map<String,Object> map=new HashMap(5);
        map.put("status",500);
        map.put("code",e.getCode());
        map.put("message",e.getMessage());
        request.setAttribute("map",map);
        return map;

    }

//    @ExceptionHandler
//    public String handleException(SysException e, HttpServletRequest request){
//        request.setAttribute("javax.servlet.error.status_code",500);
//        Map<String,Object> map=new HashMap(5);
//        map.put("code",e.getCode());
//        map.put("message",e.getMessage());
//        request.setAttribute("map",map);
//
//        return "forward:/error";
//
//    }
}
