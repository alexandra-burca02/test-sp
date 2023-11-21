package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.io.IOException;
import java.net.URL;
import java.util.List;

@SpringBootApplication
public class DecoderApp {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            List<Message> messages = objectMapper.readValue(new URL("file:src/messages.json"), new TypeReference<List<Message>>(){});


            for (Message message : messages) {
                if (message instanceof AtreidesMessage) {

                    AtreidesMessage atreidesMessage = (AtreidesMessage) message;
                    System.out.println("Atreides Message: " + decodeMessage(atreidesMessage.getJbppf()));
                } else if (message instanceof HarkonnenMessage) {

                    HarkonnenMessage harkonnenMessage = (HarkonnenMessage) message;
                    System.out.println("Harkonnen Message: " + decodeMessage(harkonnenMessage.getOguuk()));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String decodeMessage(String encodedMessage) {
        return "Messi: " + encodedMessage;
    }
}