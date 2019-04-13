package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
public class testJpa {



    @RequestMapping("/findById/{start}/{size}")
    public String findById(@RequestParam("ids") List<Integer> ids,@RequestParam("page") int page,@RequestParam("size") int size){





        return null;

    }
}
