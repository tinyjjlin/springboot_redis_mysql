package com.tiny.springboot_redis_mysql.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public  String index(){
        return "hello springboot wold!";
    }
}


