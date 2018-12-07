package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController extends BaseController {

    @RequestMapping(value = "/home")
    public String home(Model model, String name) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", name);
        model.addAttribute("user", map);
        model.addAttribute("msg", "Hello World");
        return "home";
    }
}
