package com.springcore.annotation.scope;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Log4j2
public class Main1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.annotation.scope");
        Product product=context.getBean("product", Product.class);
        log.info(product.hashCode());

        Product product1=context.getBean("product", Product.class);
        log.info(product1.hashCode());

    }
}
