package com.blobProj.abhiJ.abhinandanJoshi.Blog.Services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AIService {

    private static final String OPENAI_API_KEY = "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";

    public String summarizeBlog(String content) {
        String apiUrl = "https://api.openai.com/v1/completions";
        RestTemplate restTemplate = new RestTemplate();

        String body = "{\"model\":\"text-davinci-003\", \"prompt\":\"Summarize the following: " + content + "\", \"max_tokens\": 100}";

        return restTemplate.postForObject(apiUrl, body, String.class);
    }
}
