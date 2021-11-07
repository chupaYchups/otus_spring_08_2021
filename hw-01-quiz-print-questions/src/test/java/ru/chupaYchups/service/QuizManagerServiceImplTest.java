package ru.chupaYchups.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.chupaYchups.dao.QuestionDao;
import ru.chupaYchups.model.Question;

import java.io.IOException;
import java.util.Arrays;

@DisplayName("Проверка того что сервис")
@ExtendWith(MockitoExtension.class)
class QuizManagerServiceImplTest {

    public static final String TEST_QUESTION_TEXT = "How are you?";
    public static final String CORRECT_ANSWER_VARIANT = "*Fine";
    public static final String INCORRECT_ANSWER_VARIANT = "Bad";
    private QuizManagerService quizManagerService;

    @Mock
    private QuestionDao questionDao;

    @Mock
    private QuestionOutputService questionOutputService;

    @BeforeEach
    void setUp() {
        quizManagerService = new QuizManagerServiceImpl(questionDao, questionOutputService);
    }

    @Test
    @DisplayName("корректно распечатывает вопросы")
    void testThatServiceCorrectlyPrintsTheQuestions() throws IOException {
        Question testQuestion = Question.builder().
            questionText(TEST_QUESTION_TEXT).
            answerVariant(CORRECT_ANSWER_VARIANT).
            answerVariant(INCORRECT_ANSWER_VARIANT).
            build();
        BDDMockito.given(questionDao.getQuestions()).willReturn(Arrays.asList(testQuestion));

        quizManagerService.printQuestions();

        Mockito.verify(questionOutputService, Mockito.times(1)).printQuestion(testQuestion);
    }
}
