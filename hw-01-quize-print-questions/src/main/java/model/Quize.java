package model;

import java.util.List;

public class Quize {

    private final User user;
    private final List<Question> questionList;

    public Quize(User user, List<Question> questionList) {
        this.user = user;
        this.questionList = questionList;
    }

    public User getUser() {
        return user;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }
}
