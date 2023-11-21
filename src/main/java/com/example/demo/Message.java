package com.example.demo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "house")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AtreidesMessage.class, name = "atreides"),
        @JsonSubTypes.Type(value = HarkonnenMessage.class, name = "harkonnen")
})
abstract class Message {
    protected String date;
    protected String message;
    protected String house;
    public Message() {}

    public Message(String date, String message, String house) {
        this.date = date;
        this.message = message;
        this.house = house;
    }
    public abstract String decode();
    @Override
    public String toString() {
        return "Message{" +
                "date='" + date + '\'' +
                ", message='" + message + '\'' +
                ", house='" + house + '\'' +
                '}';
    }
}