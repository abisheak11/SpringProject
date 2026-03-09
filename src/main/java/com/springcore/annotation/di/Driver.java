package com.springcore.annotation.di;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import javax.inject.Inject;

@Log4j2
@Component
public class Driver {

    @Autowired
    public Honda honda;

    public Toyota toyota;
    public Tata tata;

    @Inject
    public Driver(Tata tata,Toyota toyota){
       this.tata=tata;
       this.toyota = toyota;
    }

    public void drive1() {
        log.info("Driver");
        honda.drive();
        toyota.drive();
        tata.drive();
    }
}
