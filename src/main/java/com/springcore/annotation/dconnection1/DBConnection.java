package com.springcore.annotation.dconnection1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@PropertySource("classpath:db.properties")
public class DBConnection {

    @Value("${db.url}")
    public String url;

    @Value("${db.username}")
    public String username;

    @Value("${db.password}")
    public String password;

    @Bean("jdbcTemplate")
    public JdbcTemplate getConnection(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        JdbcTemplate jdbc = new JdbcTemplate();
        jdbc.setDataSource(dataSource);
        return jdbc;
    }

}
