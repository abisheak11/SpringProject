package com.springcore.daolayer;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log4j2
@Repository
public class AccountDao {
    @Autowired
    public JdbcTemplate jdbctemplate;

    @Transactional
    public void populate(Accounts accounts) {
        String sql = "INSERT INTO Accounts1(Id,Account_number,Account_name,Account_type) VALUES (accounts_seq.NEXTVAL,?,?,?)";
        jdbctemplate.update(sql, accounts.getAccountNumber(), accounts.getAccountName(), accounts.getAccountType());
    }

    @Transactional
    public void update(Accounts accounts1) {
      String sql = "UPDATE Accounts1 SET Account_number=?, Account_name=?, Account_type=? WHERE id=?";

      jdbctemplate.update(sql, accounts1.getAccountNumber(), accounts1.getAccountName(), accounts1.getAccountType(), accounts1.getId());

    }

    @Transactional
    public void delete(int id) {
        String sql = "DELETE FROM Accounts1 WHERE id=?";
        jdbctemplate.update(sql,id );
        }
        public List<Accounts> findAll(){
        String sql ="SELECT * FROM Accounts1";
        return jdbctemplate.query(sql,new AccountMapper());
        }
        public List<Accounts>find1(int id){
            String sql ="SELECT * FROM Accounts1 WHERE id = ?";
            return jdbctemplate.query(sql,new AccountMapper(),id);
        }
    }
