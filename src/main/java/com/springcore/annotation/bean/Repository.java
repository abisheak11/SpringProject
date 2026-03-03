package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;

@org.springframework.stereotype.Repository
@Log4j2
public class Repository {
    public void getRepository(){
        log.info("repository annotation");
    }
}
