package com.djj.design.test.annotion;

import com.djj.design.test.User;

public class FaceEvent extends BaseEvent<User> {

    public FaceEvent(User user) {
        super(user);
    }

    public FaceEvent(Object source, User user) {
        super(source, user);
    }

}
