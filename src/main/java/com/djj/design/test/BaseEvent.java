package com.djj.design.test;

import org.springframework.context.ApplicationEvent;

public abstract class BaseEvent extends ApplicationEvent {
    public BaseEvent(Object source) {
        super(source);
    }
}
