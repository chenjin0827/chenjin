package com.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
//    @RequestMapping("/")
    public class HelloWorldController {
        @RequestMapping("/")
        public String sayHello() {
            return "Hello,World!";
        }
    }
