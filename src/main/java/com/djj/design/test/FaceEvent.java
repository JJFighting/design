package com.djj.design.test;

public class FaceEvent extends BaseEvent {

    /**
     * @author 94977
     * @time 2018/7/22 15:50
     * @param * @param null
     * @return
     * @description  必须要实现的构造方法
     */
    public FaceEvent(User user) {
        super(user);
    }
}
