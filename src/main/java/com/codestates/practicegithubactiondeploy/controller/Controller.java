package com.codestates.practicegithubactiondeploy.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class Controller {
    @GetMapping("/")
    public String hello(){
        return "Hello World!!..";
    }
}
