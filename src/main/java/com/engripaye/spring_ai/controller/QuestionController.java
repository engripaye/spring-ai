package com.engripaye.spring_ai.controller;

import com.engripaye.spring_ai.model.AnswerResponse;
import com.engripaye.spring_ai.model.QuestionRequest;
import com.engripaye.spring_ai.service.QuestionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/question")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }

    @PostMapping("/ask")
        public AnswerResponse askQuestion(@RequestBody QuestionRequest request){
        String answer = questionService.answerQuestion(request.getQuestion());
        AnswerResponse response = new AnswerResponse();
        response.setAnswer(answer);
        return response;
    }
}
