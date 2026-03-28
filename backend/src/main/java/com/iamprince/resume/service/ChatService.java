package main.java.com.iamprince.resume.service;

import main.java.com.iamprince.resume.dto.ChatResponse;

public interface ChatService {

    ChatResponse getAnswer(String question);
    
}
