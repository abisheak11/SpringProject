package com.springcore.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.componentscan");
        Order order = context.getBean("order", Order.class);
        order.getOrder();
    }
}
