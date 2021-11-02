package ru.chupaYchups.dao;

import lombok.RequiredArgsConstructor;
import ru.chupaYchups.model.Question;
import java.util.List;

@RequiredArgsConstructor
public class CSVQuestionDao implements QuestionDao {

    private final String fileName;

    @Override
    public List<Question> getQuestions() {
        return null;
    }
}
