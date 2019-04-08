package com.djj.design.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class FaceEventListener2 implements ApplicationListener<FaceEvent> {

    @Override
    public void onApplicationEvent(FaceEvent event) {
        User user = (User) event.getSource();
        log.info("===> 收到事件:  {}",user);
        // .....

        System.out.println("事件处理结束。。。");

    }
}
