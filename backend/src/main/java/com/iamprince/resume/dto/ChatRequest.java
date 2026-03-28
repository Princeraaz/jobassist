package com.iamprince.resume.dto;
import java.time.Instant;

public class ChatRequest {

    private String question;
    private Instant timestamp;

    public ChatRequest() {
    }

    public ChatRequest(String question, Instant timestamp) {
        this.question = question;
        this.timestamp = timestamp;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }
    
}
