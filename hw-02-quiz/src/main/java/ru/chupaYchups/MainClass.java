package ru.chupaYchups;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ru.chupaYchups.service.QuizManagerService;

import java.io.IOException;

@Configuration
@ComponentScan
public class MainClass {

    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainClass.class);
        QuizManagerService quizManagerService = context.getBean(QuizManagerService.class);
        quizManagerService.startQuiz();
    }
}
