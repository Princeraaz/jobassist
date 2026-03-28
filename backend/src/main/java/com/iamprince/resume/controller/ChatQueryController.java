package com.iamprince.resume.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.http.ResponseEntity;
import com.iamprince.resume.dto.ChatResponse;
import com.iamprince.resume.service.ChatService;

@RestController
public class ChatQueryController {

    private final ChatService chatService;

    // Constructor Injection: This is the professional way to link the Service to the Controller
    public ChatQueryController(ChatService chatService) {
        this.chatService = chatService;
    }

    /**
     * Endpoint to handle chat queries from the frontend. This is a placeholder
     * implementation and should be replaced with actual logic to process the
     * question and generate a response.
     */
    @PostMapping("/api/chat")
    @ResponseBody
    public ResponseEntity<ChatResponse> handleChatQuery(String question) {
        // 1. Extract the question from the DTO
        String userQuestion = question; // In a real implementation, this would come from the ChatRequest DTO
        
        // 2. Pass it to the Service layer
        ChatResponse chatResponse = chatService.getAnswer(userQuestion);
        
        // 3. Wrap the result in a Response DTO and return with HTTP 200 OK
        return ResponseEntity.ok(chatResponse);
    }
}
