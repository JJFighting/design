package com.djj.design.system.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author GDDX00045
 */
@Setter
@Getter
@AllArgsConstructor
public class SysException extends RuntimeException {
    private Integer code;
    private String message;

    public SysException(SysExceptionEnum sysExceptionEnum) {
        this.code =sysExceptionEnum.getCode();
        this.message=sysExceptionEnum.getMessage();
    }
}
