package ru.chupaYchups.service;

import java.io.IOException;

public interface QuizManagerService {
    void doAQuiz();
    void printQuestions() throws IOException;
}
