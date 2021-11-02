package ru.chupaYchups.service;

import lombok.RequiredArgsConstructor;
import ru.chupaYchups.model.Question;
import java.io.PrintStream;

@RequiredArgsConstructor
public class PrintStreamQuestionOutputService implements QuestionOutputService {

    private final PrintStream printStream;

    @Override
    public void printQuestion(Question question) {
        printStream.println(question.getQuestionText());
    }
}
