package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;

@org.springframework.stereotype.Component
@Log4j2
public class Component {

    public void getComponent(){
        log.info("component annotation");

    }
}
