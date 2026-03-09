package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class Tata implements Vehicle{
    @Override
    public void drive() {
        log.info("Driving Tata Car");
    }
}
