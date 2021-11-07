package ru.chupaYchups.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.InputStream;

@Service
public class InputStreamAnswerInputService implements AnswerInputService {

    private final InputStream inputStream;

    @Autowired
    public InputStreamAnswerInputService(@Value("#{T(java.lang.System).in}") InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public String obtainAnswer() {
        return null;
    }
}
