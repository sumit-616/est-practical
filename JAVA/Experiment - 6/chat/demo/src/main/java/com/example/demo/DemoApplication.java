package com.example.demo;

import com.example.Model.ChatRoom;
import com.example.Model.Client;
import com.example.Model.Message;

public class DemoApplication {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        
        // Creating four client threads
        Thread client1 = new Thread(new ClientThread(chatRoom, new Client("Alice", 1)));
        Thread client2 = new Thread(new ClientThread(chatRoom, new Client("Bob", 2)));
        Thread client3 = new Thread(new ClientThread(chatRoom, new Client("Charlie", 3)));
        Thread client4 = new Thread(new ClientThread(chatRoom, new Client("David", 4)));
        
        // Starting client threads
        client1.start();
        client2.start();
        client3.start();
        client4.start();
    }
}

class ClientThread implements Runnable {
    private final ChatRoom chatRoom;
    private final Client client;
    
    public ClientThread(ChatRoom chatRoom, Client client) {
        this.chatRoom = chatRoom;
        this.client = client;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) { // Each client sends 3 messages
            chatRoom.addMessage(new Message("Hello from " + client.getName(), client));
            try {
                Thread.sleep(2000); // Simulating delay between messages
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
