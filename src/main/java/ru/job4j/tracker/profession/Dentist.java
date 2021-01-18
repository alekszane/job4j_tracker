package ru.job4j.tracker.profession;

import java.time.LocalDate;

public class Dentist extends Doctor {
    public Dentist(String name, String surname, String education, LocalDate birthday, String specific) {
        super(name, surname, education, birthday, specific);
    }
}
