package com.springcore.aop1;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
@Log4j2
@Component
public class Student {

    public void getDetail(String studentName,int age){
        if( age>13){
            log.info("Age should be less than 13");

        }
    }
}
