package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Component1 {

    public void getComponent(){
        log.info("component annotation");

    }
}
