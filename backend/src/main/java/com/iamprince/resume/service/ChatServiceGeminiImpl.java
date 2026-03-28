package com.iamprince.resume.service;

import com.iamprince.resume.dto.ChatResponse;
import java.time.Instant;
import org.springframework.stereotype.Service;



@Service
public class ChatServiceGeminiImpl implements ChatService {

    // private final String GEMINI_API_URL = "https://generativelanguage.googleapis.com/v1beta/models/gemini-2.5-flash:generateContent?key={{GEMINI_API_KEY}}";

    private final String API_KEY= "AIzaSyBCHJU0g9wxsf-OHw6zx4LMVgQJL6etbt0";

    // Client client;
    // ChatServiceGeminiImpl(String apiKey) {
    //     this.client = new Client(apiKey);
    // }

    @Override
    public ChatResponse getAnswer(String question) {
        // For learning, you can start by returning a hardcoded string 
        // to test your Postman -> Controller -> Service flow.
        // return "Mock Response: You asked about " + question;

        // Logic for Gemini API Call:
        // 1. Build the JSON request body Gemini expects
        // 2. Use RestTemplate or WebClient to send a POST request
        // 3. Parse the JSON response to get the 'text' field
        
        return new ChatResponse("Gemini integration logic goes here using key: " + API_KEY, Instant.now());
    }
    
}
