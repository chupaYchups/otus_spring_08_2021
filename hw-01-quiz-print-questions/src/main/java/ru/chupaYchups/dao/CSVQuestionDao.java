package ru.chupaYchups.dao;

import lombok.RequiredArgsConstructor;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.core.io.ClassPathResource;
import ru.chupaYchups.model.Question;
import ru.chupaYchups.service.CSVRecordToQuestionConverter;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
public class CSVQuestionDao implements QuestionDao {

    private final String fileName;
    private final CSVRecordToQuestionConverter csvRecordToQuestionConverter;

    @Override
    public List<Question> getQuestions() throws IOException {
        List<Question> questionList = new ArrayList<>();
        ClassPathResource classPathResource = new ClassPathResource(fileName);
        for (CSVRecord record : CSVFormat.DEFAULT.parse(new FileReader(classPathResource.getFile()))) {
           Question question = csvRecordToQuestionConverter.convert(record);
           questionList.add(question);
        }
        return questionList;
    }
}
