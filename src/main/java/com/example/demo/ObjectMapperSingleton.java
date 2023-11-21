package com.example.demo;

import com.fasterxml.jackson.databind.ObjectMapper;

class ObjectMapperSingleton {
    private static ObjectMapper instance;
    private ObjectMapperSingleton() {
    }
    public static ObjectMapper getInstance() {
        if (instance == null) {
            instance = new ObjectMapper();
        }
        return instance;
    }
}
