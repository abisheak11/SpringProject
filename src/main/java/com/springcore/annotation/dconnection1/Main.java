package com.springcore.annotation.dconnection1;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.dconnection1");
      STDDAOLayer stddaoLayer  = context.getBean("stdLayer", STDDAOLayer.class);
        STD std1 = new STD();
        std1.setRollNumber("123");
        std1.setName("Ajay");
        std1.setGender("Male");
        //stddaoLayer.insert(std1);
        List<STD>stdList=stddaoLayer.findAll("123");
        stdList.forEach(std -> log.info(std));
    }
}
