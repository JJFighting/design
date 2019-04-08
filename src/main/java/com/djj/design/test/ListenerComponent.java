package com.djj.design.test;


import com.djj.design.test.annotion.ArmEvent;
import com.djj.design.test.annotion.FaceEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;


@Slf4j
@Component
public class ListenerComponent {



//    @TransactionalEventListener(fallbackExecution = true)
    @Order(1)
    @EventListener
    public void onApplicationEvent(com.djj.design.test.annotion.FaceEvent event) {
        User user =event.getEventData();
        String name = Thread.currentThread().getName();
        log.info("===> 收到事件:  {}，线程名为： {}",user,name);
//        throw new  RuntimeException("监听事件抛出异常");
    }


    @EventListener({com.djj.design.test.annotion.FaceEvent.class, com.djj.design.test.annotion.ArmEvent.class})
    @Order(2)
    public void onApplicationEvent3(Object event) {

        if(event instanceof com.djj.design.test.annotion.FaceEvent){
            log.info("===> B 收到人脸事件:  {}",((FaceEvent) event).getEventData());
        }else if(event instanceof com.djj.design.test.annotion.ArmEvent){
            com.djj.design.test.annotion.ArmEvent armEvent = (ArmEvent) event;
            log.info("===> B 收到臂膀事件:  {}",armEvent.getEventData());
        }
    }


}
