package ru.chupaYchups.model;

import lombok.Data;
import lombok.NonNull;

import java.util.List;

@Data
public class Question {
    @NonNull
    private final String questionText;
    @NonNull
    private final List<String> answerVariantList;
    @NonNull
    private final int rightAnswerNum;

    public boolean checkAnswer(int answerNum) {
        return answerNum == rightAnswerNum;
    }

}
