package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import ch.qos.logback.core.model.Model;

@Controller
public class OsyoController {

    @GetMapping("/")
    public String main(Model main) {

        return "main";
    }

}
