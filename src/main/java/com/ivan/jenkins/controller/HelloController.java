package com.ivan.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ivan
 * @Title: HelloController 测试controller
 * @date 2021/1/2715:36
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Hello, This is Test For Jenkins.";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, Ivan.";
    }
}
