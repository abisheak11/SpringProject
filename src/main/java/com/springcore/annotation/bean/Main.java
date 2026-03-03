package com.springcore.annotation.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.springcore");
        Payment payment = applicationContext.getBean("payment", Payment.class);
        payment.getPayment();
        Component component = applicationContext.getBean("component", Component.class);
        component.getComponent();
        Repository repository = applicationContext.getBean("repository", Repository.class);
        repository.getRepository();
    }
}
