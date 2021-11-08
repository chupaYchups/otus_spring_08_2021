package ru.chupaYchups.dao;
import ru.chupaYchups.model.Question;

import java.io.IOException;
import java.util.List;

public interface QuestionDao {
    List<Question> getQuestions() throws IOException;
}
