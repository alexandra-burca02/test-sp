package com.example.demo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "house")
@JsonSubTypes({
        @JsonSubTypes.Type(value = AtreidesMessage.class, name = "Atreides"),
        @JsonSubTypes.Type(value = HarkonnenMessage.class, name = "Harkonnen")
})
abstract class Message {
    private String house;

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }
}