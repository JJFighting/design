package com.djj.design.test.annotion;

import com.djj.design.test.User;

public class ArmEvent extends BaseEvent<User> {

    public ArmEvent(User user) {
        super(user);
    }

    public ArmEvent(Object source, User user) {
        super(source, user);
    }

}
