package main.java.com.iamprince.resume.dto;

import java.time.Instant;

public class ChatResponse {
   private String answer;
   private Instant timestamp;

   public  ChatResponse() {
   }

   public ChatResponse(String var1, Instant var2) {
      this.answer = var1;
      this.timestamp = var2;
   }

   public String getAnswer() {
      return this.answer;
   }

   public void setAnswer(String var1) {
      this.answer = var1;
   }

   public Instant getTimestamp() {
      return this.timestamp;
   }

   public void setTimestamp(Instant var1) {
      this.timestamp = var1;
   }
}
