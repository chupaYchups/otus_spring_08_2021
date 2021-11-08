package ru.chupaYchups.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chupaYchups.model.Quiz;

@Service
@RequiredArgsConstructor
public class QuizServiceImpl implements QuizService {

    private final QuestionOutputService questionOutputService;
    private final InputService answerInputService;

    @Override
    public String doAQuiz(Quiz quiz) {
        quiz.forEach(question -> {
            questionOutputService.printQuestion(question);
            int answer = Integer.parseInt(answerInputService.obtainAnswer());
            quiz.answerToCurrentQuestion(answer);
        });
        return quiz.getResult();
    }
}
