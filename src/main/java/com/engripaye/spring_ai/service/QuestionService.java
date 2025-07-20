package com.engripaye.spring_ai.service;

import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.ollama.OllamaChatModel;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

    private final OllamaChatModel chatModel;

    public QuestionService(OllamaChatModel chatModel) {
        this.chatModel = chatModel;
    }

    public String answerQuestion(String question) {
        Prompt prompt = new Prompt("Answer this: " + question);

        return chatModel
                .call(prompt)              // returns Response<ChatResponse>
                .getResult()              // unwraps ChatResponse
                .getOutput()              // ChatResponseOutput (assistant's message)
                .getText();           // returns response text
    }
}
