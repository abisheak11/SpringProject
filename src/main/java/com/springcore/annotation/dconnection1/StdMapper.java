package com.springcore.annotation.dconnection1;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StdMapper implements RowMapper<STD> {
    @Override
    public STD mapRow(ResultSet rs, int rowNum) throws SQLException {
        STD std = new STD();
        std.setRollNumber(rs.getString("S_ROLLNO"));
        std.setGender(rs.getString("S_GENDER"));
        std.setName(rs.getString("S_NAME"));
        return std;
    }
}
