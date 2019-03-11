package com.djj.design.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author GDDX00045
 */
@Setter
@Getter
@AllArgsConstructor
public class ResponseBean {
    /**
     * http 状态码
     */
    private int code;
    /**
     * 返回信息
     */
    private String msg;
    /**
     * 返回的数据
     */
    private Object data;

    public static ResponseBean SUCCESS(String msg){
        return new ResponseBean(200,msg,null);
    }
    public static ResponseBean SUCCESS(String msg,Object data){
        return new ResponseBean(200,msg,data);
    }
    public static ResponseBean ERROR(String msg){
        return new ResponseBean(-1,msg,null);
    }
    public static ResponseBean ERROR(String msg,Object data){
        return new ResponseBean(-1,msg,data);
    }
}
