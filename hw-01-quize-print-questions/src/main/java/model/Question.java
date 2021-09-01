package model;

import java.util.List;

public class Question {

    private final String questionText;
    private final List<Answer> answerVariantList;
    private final Answer rightAnswer;

    public Question(String questionText, List<Answer> answerVariantList, Answer rightAnswer) {
        this.questionText = questionText;
        this.answerVariantList = answerVariantList;
        this.rightAnswer = rightAnswer;
    }

    public String getQuestionText() {
        return questionText;
    }

    public List<Answer> getAnswerVariantList() {
        return answerVariantList;
    }

    public Answer getRightAnswer() {
        return rightAnswer;
    }

}
