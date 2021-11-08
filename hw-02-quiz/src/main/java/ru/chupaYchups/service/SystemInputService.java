package ru.chupaYchups.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.InputStream;
import java.util.Scanner;

@Service
public class SystemInputService implements InputService {

    private final InputStream inputStream;
    private Scanner scanner;

    @Autowired
    public SystemInputService(@Value("#{T(java.lang.System).in}") InputStream inputStream) {
        this.inputStream = inputStream;
    }

    @Override
    public String obtainAnswer() {
        if (scanner == null) {
            scanner = new Scanner(inputStream);
        }
        return scanner.nextLine();
    }
}
