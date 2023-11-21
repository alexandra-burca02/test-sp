package com.example.demo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URL;
import java.util.List;

class MessageDecoder {
    private final ObjectMapper objectMapper;
    private static final MessageDecoder INSTANCE = new MessageDecoder();

    private MessageDecoder() {
        objectMapper = ObjectMapperSingleton.getInstance();
    }
    public static MessageDecoder getInstance() {
        return INSTANCE;
    }
    public List<Message> readMessages(String fileUrl) {
        try {
            return objectMapper.readValue(new URL(fileUrl), new TypeReference<List<Message>>() {});
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}