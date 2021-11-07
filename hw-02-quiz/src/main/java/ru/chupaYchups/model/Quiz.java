package ru.chupaYchups.model;

import lombok.Builder;
import lombok.NonNull;
import java.util.List;

@Builder
public class Quiz {
    @NonNull
    private final User user;
    @NonNull
    private final List<Question> questionList;
}
