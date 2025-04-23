package com.example.Model;

import java.time.LocalDateTime;
//import java.util.HashMap;

public class Message {
    private String message;
    private LocalDateTime timestamp;
    private Client sender;

    public Message(String message, Client sender) {
        this.message = message;
        this.sender = sender;
        this.timestamp = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public Client getSender() {
        return sender;
    }

    @Override
    public String toString() {
        return "[" + timestamp + "] " + sender.getName() + ": " + message;
    }
}