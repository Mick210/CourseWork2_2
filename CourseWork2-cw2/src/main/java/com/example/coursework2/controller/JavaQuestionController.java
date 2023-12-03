package com.example.coursework2.controller;

import com.example.coursework2.questionclass.Question;
import com.example.coursework2.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/java_exam")

public class JavaQuestionController {

    private QuestionService questionService;
    @Autowired
    public JavaQuestionController(@Qualifier("javaQuestions") QuestionService questionService) {
        this.questionService = questionService;
    }

    @GetMapping("/java")
    public Collection<Question> getAllQuestions() {
        return questionService.getAll();
    }


    @GetMapping("/add")
    public Question addQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.add(question, answer);
    }

    @GetMapping("/remove")
    public Question removeQuestion(@RequestParam String question, @RequestParam String answer) {
        return questionService.remove(new Question(question, answer));
    }
}
