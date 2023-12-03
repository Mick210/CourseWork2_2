package com.example.coursework2.service;

import com.example.coursework2.questionclass.Question;
import com.example.coursework2.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Component
@Qualifier("javaQuestions")
public class JavaQuestionService implements QuestionService {
    private QuestionRepository questionRepository;
    private Random random;

    @Autowired
    public JavaQuestionService(@Qualifier("javaQuestionRepository") QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
        this.random = new Random();
    }

    @Override
    public Question add(String question, String answer) {
        Question result = new Question(question, answer);
        return questionRepository.add(result);
    }

    @Override
    public Question add(Question question) {
        return questionRepository.add(question);
    }

    @Override
    public Question remove(Question question) {
        if (!questionRepository.getAll().contains(question)) {
            throw new IllegalArgumentException("Question is not found");
        }
        return questionRepository.remove(question);
    }

    @Override
    public Collection<Question> getAll() {
        return questionRepository.getAll();
    }

    @Override
    public Question getRandomQuestion() {
        Collection<Question> allQuestions = questionRepository.getAll();
        if (!allQuestions.isEmpty()) {
            int rndNum = random.nextInt(allQuestions.size());
            List<Question> questionsList = new ArrayList<>(allQuestions);
            return questionsList.get(rndNum);
        } else throw new NoSuchElementException("Set is empty");
    }
}
