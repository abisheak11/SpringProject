package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Log4j2

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.springcore.annotation.di");
        Driver driver = applicationContext.getBean("driver", Driver.class);
        driver.drive1();
    }
}
