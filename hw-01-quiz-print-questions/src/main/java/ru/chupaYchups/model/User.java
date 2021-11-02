package ru.chupaYchups.model;

import lombok.Data;
import lombok.NonNull;

@Data
public class User {
    @NonNull
    private final String userName;
}
