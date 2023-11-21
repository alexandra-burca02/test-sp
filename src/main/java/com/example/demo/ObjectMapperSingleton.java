package com.example.demo;
import com.fasterxml.jackson.databind.ObjectMapper;

class ObjectMapperSingleton {
    private static final ObjectMapper INSTANCE = new ObjectMapper();
    private ObjectMapperSingleton() {}

    public static ObjectMapper getInstance() {
        return INSTANCE;
    }
}