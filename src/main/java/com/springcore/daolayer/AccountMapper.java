package com.springcore.daolayer;

import org.jspecify.annotations.Nullable;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountMapper implements RowMapper <Accounts>{
    @Override
    public @Nullable Accounts mapRow(ResultSet rs, int rowNum) throws SQLException {
        Accounts accounts = new Accounts();
        accounts.setId(rs.getInt("ID"));
        accounts.setAccountNumber(rs.getString("Account_Number"));
        accounts.setAccountName(rs.getString("Account_Name"));
        accounts.setAccountType(rs.getString("Account_Type"));
        return accounts;
    }
}
