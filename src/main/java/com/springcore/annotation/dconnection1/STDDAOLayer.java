package com.springcore.annotation.dconnection1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("stdLayer")
public class STDDAOLayer {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public void insert(STD std){
        String sql = "INSERT INTO STD(S_ROLLNO,S_NAME,S_GENDER) VALUES(?,?,?)";
        jdbcTemplate.update(sql,std.getRollNumber(),std.getName(),std.getGender());
    }
    public List<STD> findAll(String rollNo){
        String sql ="SELECT * FROM STD WHERE S_ROLLNO = ?";
       return jdbcTemplate.query(sql,new StdMapper(),rollNo);
    }

}
