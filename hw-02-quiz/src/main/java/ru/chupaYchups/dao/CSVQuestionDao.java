package ru.chupaYchups.dao;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Repository;
import ru.chupaYchups.model.Question;
import ru.chupaYchups.service.CSVRecordToQuestionConverter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CSVQuestionDao implements QuestionDao {

    private final String fileName;
    private final CSVRecordToQuestionConverter csvRecordToQuestionConverter;

    @Autowired
    public CSVQuestionDao(@Value("questions.csv") String fileName, CSVRecordToQuestionConverter csvRecordToQuestionConverter) {
        this.fileName = fileName;
        this.csvRecordToQuestionConverter = csvRecordToQuestionConverter;
    }

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
