package com.iamprince.resume.service;

import com.iamprince.resume.dto.ChatResponse;

public interface ChatService {

    ChatResponse getAnswer(String question);
    
}
