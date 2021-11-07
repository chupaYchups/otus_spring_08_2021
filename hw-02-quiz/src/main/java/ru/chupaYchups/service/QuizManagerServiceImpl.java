package ru.chupaYchups.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chupaYchups.dao.QuestionDao;
import ru.chupaYchups.model.Question;
import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuizManagerServiceImpl implements QuizManagerService {

    private final QuestionDao questionDao;
    private final QuestionOutputService questionOutputService;

    @Override
    public void doAQuiz() {
        //TODO
    }

    @Override
    public void printQuestions() throws IOException {
        List<Question> questionList = questionDao.getQuestions();
        questionList.forEach(question -> {
            questionOutputService.printQuestion(question);
        });
    }
}
