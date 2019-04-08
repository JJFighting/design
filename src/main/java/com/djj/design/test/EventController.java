package com.djj.design.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/event")
public class EventController {


    @Autowired
    FaceHandler faceHandler;

    @GetMapping("/{name}")
    @Transactional(rollbackFor = Exception.class)
    public void event(@PathVariable String name){
        User user=new User();
        user.setName(name);
        faceHandler.handle(user);
        boolean insert = user.insert();
        log.info("更新标识："+insert);
    }




}
