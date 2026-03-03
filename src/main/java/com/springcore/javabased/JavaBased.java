package com.springcore.javabased;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Configuration
@Log4j2
public class JavaBased {

    @Bean("date")
    public Date getDate(){
        Date date = new Date();
        return date;

    }
}
