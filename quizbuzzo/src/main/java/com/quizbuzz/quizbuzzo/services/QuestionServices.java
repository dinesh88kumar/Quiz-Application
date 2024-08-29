package com.quizbuzz.quizbuzzo.services;

import com.quizbuzz.quizbuzzo.model.Question;
import org.springframework.stereotype.Service;


public interface QuestionServices {

    public Question createQuestion(Question question);
}
