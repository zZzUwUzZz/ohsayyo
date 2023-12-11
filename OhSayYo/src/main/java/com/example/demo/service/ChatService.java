package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ChatDao;

@Service
public class ChatService {
    
    @Autowired
    private ChatDao chatDao;

}
