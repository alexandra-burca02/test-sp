package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
@SpringBootApplication
public class DecoderApp {
    public static void main(String[] args) {
        MessageDecoder messageDecoder = MessageDecoder.getInstance();
        List<Message> messages = messageDecoder.readMessages("file:src/messages.json");

        for (Message message : messages) {
            System.out.println(message);
        }
    }
}