package com.djj.design.system.ExceptionHandler;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @author GDDX00045
 */
@Component
public class SysErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        Map<String, Object> errorAttributes = super.getErrorAttributes(webRequest, includeStackTrace);
        Object map = webRequest.getAttribute("map", 0);
        errorAttributes.put("map",map);
        errorAttributes.remove("trace");
        return errorAttributes;
    }
}
