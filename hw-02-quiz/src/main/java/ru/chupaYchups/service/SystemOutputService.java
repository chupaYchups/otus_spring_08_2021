package ru.chupaYchups.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service
public class SystemOutputService implements OutputService {

    private final PrintStream printStream;

    @Autowired
    public SystemOutputService(@Value("#{T(java.lang.System).out}")PrintStream printStream) {
        this.printStream = printStream;
    }

    @Override
    public void printLn(String output) {
        printStream.println(output);
    }
}
