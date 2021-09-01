package model;

import java.util.List;

public class Question {

    private final String questionText;
    private final List<Answer> answerVariantList;

    public Question(String questionText, List<Answer> answerVariantList) {
        this.questionText = questionText;
        this.answerVariantList = answerVariantList;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Answer> getAnswerVariantList() {
        return answerVariantList;
    }
}
