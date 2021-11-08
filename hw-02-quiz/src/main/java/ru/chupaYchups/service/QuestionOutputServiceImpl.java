package ru.chupaYchups.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.chupaYchups.model.Question;
import java.util.List;
import java.util.stream.IntStream;

@Service
@RequiredArgsConstructor
public class QuestionOutputServiceImpl implements QuestionOutputService {

    private final OutputService outputService;

    @Override
    public void printQuestion(Question question) {
        outputService.printLn(question.getQuestionText());
        List<String> answerVariantList = question.getAnswerVariantList();
        IntStream.range(1, answerVariantList.size() + 1).forEach(index -> {
            outputService.printLn(index + "." + answerVariantList.get(index - 1));
        });
    }
}
