package com.example.demo;

class AtreidesMessage extends Message {
    public AtreidesMessage() {}
    public AtreidesMessage(String date, String message) {
        super(date, message, "atreides");
    }
    @Override
    public String decode() {
        return message;
    }
}