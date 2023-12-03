package com.example.coursework2.repository;

import com.example.coursework2.questionclass.Question;

import java.util.Collection;

public interface QuestionRepository {

    Question add(Question question);

    Question remove(Question question);

    Collection<Question> getAll();


}
