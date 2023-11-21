package com.example.demo;

class HarkonnenMessage extends Message {
    public HarkonnenMessage() {}
    public HarkonnenMessage(String date, String message) {
        super(date, message, "harkonnen");
    }
    @Override
    public String decode() {

        return message;
    }
}