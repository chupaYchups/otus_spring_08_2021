package ru.chupaYchups.service;

import lombok.RequiredArgsConstructor;
import ru.chupaYchups.model.Question;
import java.io.PrintStream;
import java.util.List;
import java.util.stream.IntStream;

@RequiredArgsConstructor
public class PrintStreamQuestionOutputService implements QuestionOutputService {

    private final PrintStream printStream;

    @Override
    public void printQuestion(Question question) {
        printStream.println(question.getQuestionText());
        List<String> answerVariantList = question.getAnswerVariantList();
        IntStream.range(1, answerVariantList.size() + 1).forEach(index -> {
            printStream.println(index + "." + answerVariantList.get(index - 1));
        });
    }
}
