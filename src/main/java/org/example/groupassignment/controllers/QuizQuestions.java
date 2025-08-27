package org.example.groupassignment.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.example.groupassignment.Question;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Data
@Component
public class QuizQuestions {

    private List<String> questions;

    public QuizQuestions() {
        questions = new ArrayList<String>();
        Question question1 = new Question(1,"Är Pippi stark?");
        questions.add(question1.toString());
    }




}
