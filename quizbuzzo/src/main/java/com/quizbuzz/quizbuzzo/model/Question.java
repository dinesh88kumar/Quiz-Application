package com.quizbuzz.quizbuzzo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int questionId;
    @NotBlank()
    private String question;
    @NotBlank(message = "Question cannot be blank")
    private String answer;
    @NotBlank(message = "Question cannot be blank")
    private String option1;
    private String option2;
    private String option3;
    private String option4;

}
