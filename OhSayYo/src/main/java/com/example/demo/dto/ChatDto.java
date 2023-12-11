package com.example.demo.dto;

import lombok.Data;

@Data
public class ChatDto {
    private String  C_USER_ID;
    private String  M_NAME;
    private String  M_PNUM;
    private String  C_MESSAGE;
    private String  C_SENDTIME;
    private String  C_RECEIVEDTIME;
    private int  C_ROOM_ID;

}
