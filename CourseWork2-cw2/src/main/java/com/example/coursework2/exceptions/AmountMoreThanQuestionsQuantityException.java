package com.example.coursework2.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class AmountMoreThanQuestionsQuantityException extends RuntimeException {
    public AmountMoreThanQuestionsQuantityException(String message) {
        super(message);
    }
}
