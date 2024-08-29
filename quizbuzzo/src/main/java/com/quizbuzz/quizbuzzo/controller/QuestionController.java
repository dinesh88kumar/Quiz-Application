package com.quizbuzz.quizbuzzo.controller;


import com.quizbuzz.quizbuzzo.model.Question;
import com.quizbuzz.quizbuzzo.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Qservices")
public class QuestionController {

    @Autowired
    QuestionServices questionServices;

    @PostMapping("/save")
    public Question createQuestion(@RequestBody Question question) {
        questionServices.createQuestion(question);
        return question;
    }
}
