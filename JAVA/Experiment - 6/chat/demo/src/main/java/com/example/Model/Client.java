package com.example.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Client {
    private int id;
    private String name;

    public Client(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void sendMessage(ChatRoom chatRoom, String message) {
        chatRoom.addMessage(new Message(message, this));
    }
}