package ru.chupaYchups.service;

import java.io.IOException;

public interface QuizManagerService {
    void startQuiz() throws IOException;
    void printQuestions() throws IOException;
}
