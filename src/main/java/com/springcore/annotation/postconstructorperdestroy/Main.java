package com.springcore.annotation.postconstructorperdestroy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.postconstructorperdestroy");

        context.close();

    }
}
