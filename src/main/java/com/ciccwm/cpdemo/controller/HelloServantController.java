package com.ciccwm.cpdemo.controller;

import com.qq.tars.spring.annotation.TarsHttpService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@TarsHttpService("HttpObj")
@RestController
public class HelloServantController {
    @RequestMapping(path = "/test")
    public String test() {
        return "hello world";
    }
}
