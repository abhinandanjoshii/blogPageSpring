package com.blobProj.abhiJ.abhinandanJoshi.Blog.Services;

import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AIService {

    private static final String COHERE_API_KEY = "lvADcdrfc7dv32GKl0o4GbVSv2IePEGdL4mfhTgV"; // Replace with your Cohere API key

    public String summarizeBlog(String content) {
        String apiUrl = "https://api.cohere.ai/v1/generate"; // Cohere's API URL
        RestTemplate restTemplate = new RestTemplate();

        String body = "{\"model\":\"command-xlarge\", \"prompt\":\"Summarize the following text: " + content + "\", \"max_tokens\": 100}";

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer " + COHERE_API_KEY);
        headers.set("Content-Type", "application/json");

        return restTemplate.postForObject(apiUrl, new org.springframework.http.HttpEntity<>(body, headers), String.class);
    }
}
