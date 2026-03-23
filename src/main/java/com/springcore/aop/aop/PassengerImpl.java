package com.springcore.aop.aop;


import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
@Repository
@Log4j2
public class PassengerImpl implements PassengerDAO {
    public static Map<String, Passenger1> passengerMap = new HashMap<>();


    @Override
    public Passenger1 getPassenger(String passengerName, int Id) {
        log.info(passengerName);
        if (null!=passengerMap.get(passengerName)){
            return passengerMap.get(passengerName);
        }
        Passenger1 passenger1 = new Passenger1(passengerName);
        passengerMap.put(passengerName,passenger1);
       log.info(passenger1);
         return passenger1;
        }
    }

