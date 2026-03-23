package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
public class Repository1 {
    public void getRepository(){
        log.info("repository annotation");
    }
}
