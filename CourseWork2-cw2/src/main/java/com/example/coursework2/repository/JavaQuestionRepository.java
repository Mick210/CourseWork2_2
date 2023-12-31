package com.example.coursework2.repository;

import com.example.coursework2.exceptions.AmountMoreThanQuestionsQuantityException;
import com.example.coursework2.questionclass.Question;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


@Repository
@Component
public class JavaQuestionRepository implements QuestionRepository {
    private final Set<Question> questionSet;
    private static final int INITIAL_CAPACITY = 10;

    public JavaQuestionRepository() {
        this.questionSet = new HashSet<>(INITIAL_CAPACITY);
    }

    @Override
    public Question add(Question question) {
        questionSet.add(question);
        return question;
    }

    @Override
    public Question remove(Question question) {
        if (!questionSet.contains(question)) {
            throw new AmountMoreThanQuestionsQuantityException("Question is not found");
        }
        Question removedQA = question;
        questionSet.remove(question);
        return removedQA;
    }

    @Override
    public Collection getAll() {
        return questionSet;
    }
}
