package com.example.coursework2.constants;

import com.example.coursework2.questionclass.Question;

import java.util.Collection;
import java.util.Set;

public class QuestionConstants {
    public static final String QUESTION1 = "question1";
    public static final String QUESTION2 = "question2";
    public static final String QUESTION3 = "question3";
    public static final String QUESTION4 = "question4";
    public static final String QUESTION5 = "question5";
    public static final String ANSWER1 = "answer1";
    public static final String ANSWER2 = "answer2";
    public static final String ANSWER3 = "answer3";
    public static final String ANSWER4 = "answer4";
    public static final String ANSWER5 = "answer5";
    public static final Question QUESTIONOBJ1 = new Question(QUESTION1, ANSWER1);
    public static final Question QUESTIONOBJ2 = new Question(QUESTION2, ANSWER2);
    public static final Question QUESTIONOBJ3 = new Question(QUESTION3, ANSWER3);
    public static final Question QUESTIONOBJ4 = new Question(QUESTION4, ANSWER4);
    public static final Question QUESTIONOBJ5 = new Question(QUESTION5, ANSWER5);

    public static final Collection<Question> ALL_QUESTIONS = Set.of(
            QUESTIONOBJ1,
            QUESTIONOBJ2,
            QUESTIONOBJ3,
            QUESTIONOBJ4,
            QUESTIONOBJ5
    );

    public static final String MATH_QUESTION1 = "math question1";
    public static final String MATH_QUESTION2 = "math question2";
    public static final String MATH_QUESTION3 = "math question3";
    public static final String MATH_QUESTION4 = "math question4";
    public static final String MATH_QUESTION5 = "math question5";

    public static final String MATH_ANSWER1 = "math answer1";
    public static final String MATH_ANSWER2 = "math answer2";
    public static final String MATH_ANSWER3 = "math answer3";
    public static final String MATH_ANSWER4 = "math answer4";
    public static final String MATH_ANSWER5 = "math answer5";

    public static final Question MATH_QUESTIONOBJ1 = new Question(MATH_QUESTION1, MATH_ANSWER1);
    public static final Question MATH_QUESTIONOBJ2 = new Question(MATH_QUESTION2, MATH_ANSWER2);
    public static final Question MATH_QUESTIONOBJ3 = new Question(MATH_QUESTION3, MATH_ANSWER3);
    public static final Question MATH_QUESTIONOBJ4 = new Question(MATH_QUESTION4, MATH_ANSWER4);
    public static final Question MATH_QUESTIONOBJ5 = new Question(MATH_QUESTION5, MATH_ANSWER5);

    public static final Collection<Question> MATH_QUESTIONS = Set.of(
            MATH_QUESTIONOBJ1,
            MATH_QUESTIONOBJ2,
            MATH_QUESTIONOBJ3,
            MATH_QUESTIONOBJ4,
            MATH_QUESTIONOBJ5
    );
}
