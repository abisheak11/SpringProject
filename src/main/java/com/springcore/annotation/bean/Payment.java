package com.springcore.annotation.bean;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class Payment {

    public Payment(){
        log.info("annotation based");
    }

    public void getPayment(){
        log.error("this is a payment method");
    }
}
