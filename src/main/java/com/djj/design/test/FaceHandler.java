package com.djj.design.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class FaceHandler {

    @Autowired
    private ApplicationContext applicationContext;

    public void handle(User user) {

        //发布事件
        applicationContext.publishEvent(new FaceEvent(user));
        applicationContext.publishEvent(new com.djj.design.test.annotion.FaceEvent(this,user));
        //进行其他业务处理
    }
}
