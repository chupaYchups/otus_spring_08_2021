package ru.chupaYchups.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Singular;

import java.util.List;

@Builder
@Getter
public class Question {
    @NonNull
    private final String questionText;
    @Singular("answerVariant")
    private List<String> answerVariantList;
    private int rightAnswerNum;

    public boolean checkAnswer(int answerNum) {
        return answerNum == rightAnswerNum;
    }
}
