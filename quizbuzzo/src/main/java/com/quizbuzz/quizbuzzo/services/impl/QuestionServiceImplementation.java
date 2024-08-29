package com.quizbuzz.quizbuzzo.services.impl;

import com.quizbuzz.quizbuzzo.model.Question;
import com.quizbuzz.quizbuzzo.repository.QuestionRepository;
import com.quizbuzz.quizbuzzo.services.QuestionServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImplementation implements QuestionServices {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public Question createQuestion(Question question) {

        Question q= questionRepository.save(question);
        return q;
    }
}
