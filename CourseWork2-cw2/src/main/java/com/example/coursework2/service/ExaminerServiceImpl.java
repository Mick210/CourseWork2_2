package com.example.coursework2.service;

import com.example.coursework2.questionclass.Question;
import com.example.coursework2.exceptions.AmountMoreThanQuestionsQuantityException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ExaminerServiceImpl implements ExaminerService {
    private final Random random;
    private final QuestionService javaQuestionService;


    @Autowired
    public ExaminerServiceImpl(QuestionService questionService) {
        this.javaQuestionService = questionService;
        this.random = new Random();
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        Collection<Question> questionsSetForExam = new HashSet<>();
        Collection<Question> allQuestions = javaQuestionService.getAll();
        int totalQuestions = allQuestions.size();
        if (amount > totalQuestions) {
            throw new AmountMoreThanQuestionsQuantityException("Запрос превышает фактическое количество содержимого");
        }
        while (amount > 0) {
            Question randomQuestion = getRandomUniqueQuestion(allQuestions);
            if (!questionsSetForExam.contains(randomQuestion)) {
                questionsSetForExam.add(randomQuestion);
                amount--;
            }
        }
        return questionsSetForExam;
    }

    private Question getRandomUniqueQuestion(Collection<Question> allQuestion) {
        int totalQuestions = allQuestion.size();
        int randomIndex = random.nextInt(totalQuestions);
        List<Question> allQuestionList = new ArrayList<>(allQuestion);
        return allQuestionList.get(randomIndex);
    }
}
