package ru.chupaYchups.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.chupaYchups.model.Question;
import java.io.PrintStream;
import java.util.List;
import java.util.stream.IntStream;

@Service
public class PrintStreamQuestionOutputService implements QuestionOutputService {

    private final PrintStream printStream;

    @Autowired
    public PrintStreamQuestionOutputService(@Value("#{T(java.lang.System).out}")PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void printQuestion(Question question) {
        printStream.println(question.getQuestionText());
        List<String> answerVariantList = question.getAnswerVariantList();
        IntStream.range(1, answerVariantList.size() + 1).forEach(index -> {
            printStream.println(index + "." + answerVariantList.get(index - 1));
        });
    }
}
