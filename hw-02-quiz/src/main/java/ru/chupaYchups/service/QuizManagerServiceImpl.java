package ru.chupaYchups.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chupaYchups.dao.QuestionDao;
import ru.chupaYchups.model.Question;
import ru.chupaYchups.model.Quiz;
import ru.chupaYchups.model.User;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizManagerServiceImpl implements QuizManagerService {

    private final QuestionDao questionDao;
    private final QuestionOutputService questionOutputService;
    private final OutputService outputService;
    private final InputService inputService;
    private final QuizService quizService;

    @Override
    public void startQuiz() throws IOException {
        outputService.printLn("Hello dear student!!! What is your name?");

        String userName = inputService.obtainAnswer();
        User user = new User(userName);

        Quiz quiz = new Quiz(user, questionDao.getQuestions());
        String result = quizService.doAQuiz(quiz);

        outputService.printLn("Your result: " + result);
    }

    @Override
    public void printQuestions() throws IOException {
        List<Question> questionList = questionDao.getQuestions();
        questionList.forEach(question -> {
            questionOutputService.printQuestion(question);
        });
    }
}
