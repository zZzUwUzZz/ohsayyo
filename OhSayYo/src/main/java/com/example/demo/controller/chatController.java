package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.ChatService;

@Controller
public class chatController {

    @Autowired
    private ChatService chatService;
 
    @GetMapping("/chat")
    public String chat(){
        return "chat";
    }
}
