package ru.chupaYchups;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.chupaYchups.service.QuizManagerService;

import java.io.IOException;

public class MainClass {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        QuizManagerService quizManagerService = context.getBean(QuizManagerService.class);
        quizManagerService.printQuestions();
    }
}
