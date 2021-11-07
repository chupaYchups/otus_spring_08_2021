package ru.chupaYchups.service;

import lombok.RequiredArgsConstructor;
import java.io.InputStream;

@RequiredArgsConstructor
public class InputStreamAnswerInputService implements AnswerInputService {

    private final InputStream inputStream;

    @Override
    public String obtainAnswer() {
        return null;
    }
}
