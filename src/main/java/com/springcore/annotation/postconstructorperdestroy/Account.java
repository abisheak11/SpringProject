package com.springcore.annotation.postconstructorperdestroy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class Account {

    @PostConstruct
    public void getBankName(){
        log.info("STATE BANK OF INDIA");
    }

    @PreDestroy
    public void getBankType(){
        log.info("SAVING ACCOUNT");
    }
}
