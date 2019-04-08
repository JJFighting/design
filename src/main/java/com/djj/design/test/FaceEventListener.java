package com.djj.design.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FaceEventListener implements ApplicationListener {

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        if(event instanceof FaceEvent){
            User user = (User) event.getSource();
            log.info("===> 收到事件:  {}",user);
            // .....
            System.out.println("事件处理结束。。。");
        }
    }
}
