package org.example.groupassignment.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuizController {

    QuizQuestions quizQuestions;

    public QuizController(QuizQuestions quizQuestions) {
        this.quizQuestions = quizQuestions;
    }

    @GetMapping("/api/questions")
    public List<String> getAllQuestions() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        List<String> jsonQuestions = quizQuestions.getQuestions();

        List<String> outPutQuestions = new ArrayList<>();

        for (String jsonQuestion : jsonQuestions) {
            mapper.writeValueAsString(jsonQuestion);
            outPutQuestions.add(jsonQuestion);
        }

        return outPutQuestions;
    }

    @PostMapping("/api/answers")
    public

}
