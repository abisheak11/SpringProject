package com.springcore.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.springcore");
        Payment1 payment = applicationContext.getBean("payment1", Payment1.class);
        payment.getPayment();
        Component1 component = applicationContext.getBean("component1", Component1.class);
        component.getComponent();
        Repository1 repository = applicationContext.getBean("repository1", Repository1.class);
        repository.getRepository();
    }
}
