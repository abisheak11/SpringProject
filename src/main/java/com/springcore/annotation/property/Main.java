package com.springcore.annotation.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.property");
        Configuration configuration = context.getBean("configuration",Configuration.class);
        configuration.getConfiguration();
    }
}
