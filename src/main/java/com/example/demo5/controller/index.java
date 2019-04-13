package com.example.demo5.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class index {


    @RequestMapping("/")
    public String index(){
        return "hello world";
    }
}
