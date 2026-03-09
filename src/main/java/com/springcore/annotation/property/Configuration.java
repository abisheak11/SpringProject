package com.springcore.annotation.property;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@Log4j2
@PropertySource("classpath:application.properties")
public class Configuration {


   @Value("${db.url}")
    private String url;

   @Value("${db.username}")
    private String username;

   @Value("${db.password}")
   private String password;

   @Value("${db.email}")
   private String email;

   public void getConfiguration(){
       log.info(url);
       log.info(username);
       log.info(password);
       log.info(email);
   }
}
