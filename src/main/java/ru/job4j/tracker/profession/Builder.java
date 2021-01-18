package ru.job4j.tracker.profession;

import java.time.LocalDate;

public class Builder extends Engineer {
    public Builder(String name, String surname, String education, LocalDate birthday, int category) {
        super(name, surname, education, birthday, category);
    }
}
