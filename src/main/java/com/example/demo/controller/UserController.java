package com.example.demo.controller;

import com.example.demo.entity.BaseResponse;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
public class UserController extends BaseController {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping(value = "{name}")
    public BaseResponse queryUser(
            @RequestHeader(required = false) String token,
            @PathVariable String name,
            @RequestParam(required = false, defaultValue = "21") int age,
            @RequestParam int gender,
            @RequestParam(required = false, defaultValue = "15") int limit) {
        Map<String, Object> params = new HashMap<>();
        if (StringUtils.isEmpty(token)) {
            return new BaseResponse<>("200", "invalidate token", params);
        }
        params.put("token", token);

        User user = new User(1001, name, age, gender);
        params.put("user", user);
        params.put("limit", limit);
        logger.info("params is {}", params);
        return new BaseResponse<>(params);
    }

    @PostMapping(value = "/update")
    public BaseResponse updateUser(@RequestBody User user) {
        user.setUser_id((long) (Math.random() * 1_0000L));
        logger.info("user is {}", user);
        return new BaseResponse<>(user);
    }
}
