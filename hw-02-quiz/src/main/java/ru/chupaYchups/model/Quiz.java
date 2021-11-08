package ru.chupaYchups.model;

import lombok.NonNull;
import java.util.Iterator;
import java.util.List;

public class Quiz implements Iterable<Question>{

    @NonNull
    private final User user;
    @NonNull
    private final List<Question> questionList;

    private final static String RESULT_STRING = "%d/%d";

    private int rightAnswerCounter = 0;
    private Question currentQuestion;
    private Iterator<Question> questionIterator;
    private boolean isFinished = false;

    public Quiz(@NonNull User user, @NonNull List<Question> questionList) {
        this.user = user;
        this.questionList = questionList;
        this.questionIterator = questionList.iterator();
    }

    public void answerToCurrentQuestion(int answer) {
        if (currentQuestion.checkAnswer(answer)) {
            rightAnswerCounter++;
        }
    }

    @Override
    public Iterator<Question> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                isFinished = !questionIterator.hasNext();
                return !isFinished;
            }

            @Override
            public Question next() {
                currentQuestion = questionIterator.next();
                return currentQuestion;
            }
        };
    }
    public String getResult() {
        return String.format(RESULT_STRING, rightAnswerCounter, questionList.size());
    }
}
