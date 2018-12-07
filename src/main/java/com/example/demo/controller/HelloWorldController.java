package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @RequestMapping
    public String index() {
        return "Hello World";
    }

    @RequestMapping(value = "/info")
    public Map<String, String> getInfo(@RequestParam String name) {
        Map<String, String> map = new HashMap<>();
        map.put("name", name);
        return map;
    }

    @RequestMapping(value = "/list")
    public List<Map<String, String>> getList() {
        List<Map<String, String>> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(getInfo("Shayne-" + i));
        }
        return list;
    }
}
