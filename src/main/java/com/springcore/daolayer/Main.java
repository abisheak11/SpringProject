package com.springcore.daolayer;

import lombok.extern.log4j.Log4j2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
@Log4j2
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.springcore.daolayer");
        AccountDao accountDao =context.getBean("accountDao", AccountDao.class);
        Accounts accounts = new Accounts();
        accounts.setId(5);
        accounts.setAccountNumber("23455567");
        accounts.setAccountName("Abishek");
       accounts.setAccountType("SavingAccount");
       //accountDao.populate(accounts);
       // accountDao.update(accounts);
       // accountDao.delete(9);
       List<Accounts>accounts1= accountDao.find1(17);
       accounts1.forEach(accounts2 -> log.info(accounts2));


    }
}
