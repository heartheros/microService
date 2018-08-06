package com.ccb.microService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}