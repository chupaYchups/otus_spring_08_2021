package ru.chupaYchups.service;

import org.apache.commons.csv.CSVRecord;
import ru.chupaYchups.model.Question;

public class CSVRecordToQuestionConverterImpl implements CSVRecordToQuestionConverter {
    public Question convert(CSVRecord csvRecord) {
        Question.QuestionBuilder questionBuilder = Question.builder();
        questionBuilder.questionText(csvRecord.get(0));
        for (int i = 1; i < csvRecord.size(); i++) {
            String variantText = csvRecord.get(i);
            if (variantText.startsWith("*")) {
                questionBuilder.rightAnswerNum(0);
                variantText = variantText.substring(1);
            }
            questionBuilder.answerVariant(variantText);
        }
        return questionBuilder.build();
    }
}
