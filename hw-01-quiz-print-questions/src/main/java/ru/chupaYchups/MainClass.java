package ru.chupaYchups;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.chupaYchups.service.QuizManagerService;

public class MainClass {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/spring-context.xml");
        QuizManagerService quizManagerService = context.getBean(QuizManagerService.class);
        quizManagerService.printQuestions();
    }
}
