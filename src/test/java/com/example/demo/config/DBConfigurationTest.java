package com.example.demo.config;

import com.example.demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Import({DemoApplication.class, DBConfiguration.class})
public class DBConfigurationTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void select() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user where user_age=20");
        System.out.println(maps);
    }
}