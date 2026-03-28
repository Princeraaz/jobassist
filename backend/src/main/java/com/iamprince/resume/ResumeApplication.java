package com.iamprince.resume;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// import com.iamprince.resume.dto.ChatRequest;
// import java.time.Instant;
// import java.lang.reflect.Field;

@SpringBootApplication
public class ResumeApplication {

    public static void main(String[] args) throws IllegalAccessException{
        // ChatRequest chatRequest = new ChatRequest("Hello, how are you?", Instant.now());
        // System.out.println("Question: " + chatRequest.getQuestion());
        // System.out.println("Timestamp: " + chatRequest.getTimestamp());
        // Class<?> clazz = chatRequest.getClass();
        // for (Field field : clazz.getDeclaredFields()){
        //     field.setAccessible(true);
        //     System.out.println(field.getName() + ": " + field.get(chatRequest));
        // }
        SpringApplication.run(ResumeApplication.class, args);

    }
}

