package com.example.Model;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    private final Object lock = new Object();
    private final List<Message> messages = new ArrayList<>();
    
    public void addMessage(Message message) {
        synchronized (lock) {
            messages.add(message);
            System.out.println("New Message: " + message);
            new Thread(() -> processMessage(message)).start();
        }
    }

    private void processMessage(Message message) {
        synchronized (lock) {
            System.out.println("Processing: " + message);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}