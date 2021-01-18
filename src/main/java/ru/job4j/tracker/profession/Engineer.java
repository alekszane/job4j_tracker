package ru.job4j.tracker.profession;

import java.time.LocalDate;

public class Engineer extends Profession {
    private int category;

    public Engineer(String name, String surname, String education, LocalDate birthday, int category) {
        super(name, surname, education, birthday);
        this.category = category;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}
