package com.springcore.aop1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.springcore.aop1");
        Student student = applicationContext.getBean("student", Student.class);
        student.getDetail("Ajay",10);
    }
}
