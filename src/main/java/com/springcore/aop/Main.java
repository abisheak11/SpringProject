package com.springcore.aop;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.aop");
        PassengerDAO passengerDAO = context.getBean("passengerImpl", PassengerDAO.class);
        passengerDAO.getPassenger("Abisheak",111);
    }
}
