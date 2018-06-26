package com.wx.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/6/25.
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello")
    private String index(){
        return "Hello World";
    }
}
