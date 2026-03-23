package com.springcore.daolayer;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@Log4j2
@PropertySource("classpath:db.properties")
public class DbConnection {
    @Value("${db.url}")
    private String url;

    @Value("${db.username}")
    private String username;

    @Value("${db.password}")
    private String password;

    @Bean("jdbctemplate")
   public JdbcTemplate getConnection(){
       DriverManagerDataSource dataSource =new DriverManagerDataSource();
       dataSource.setUrl(url);
       dataSource.setUsername(username);
       dataSource.setPassword(password);
       JdbcTemplate jdbc = new JdbcTemplate();
       jdbc.setDataSource(dataSource);
       return jdbc;
   }
}
