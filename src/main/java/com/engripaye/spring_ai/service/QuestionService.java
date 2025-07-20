package com.engripaye.spring_ai.service;

import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    private final OllamaChatModel chatModel;

    public QuestionService(OllamaChatModel chatModel) {
        this.chatModel = chatModel;
    }
}
