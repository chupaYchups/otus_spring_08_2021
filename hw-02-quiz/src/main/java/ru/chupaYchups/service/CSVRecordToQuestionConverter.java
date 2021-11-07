package ru.chupaYchups.service;

import org.apache.commons.csv.CSVRecord;
import ru.chupaYchups.model.Question;

public interface CSVRecordToQuestionConverter {
    Question convert(CSVRecord csvRecord);
}
