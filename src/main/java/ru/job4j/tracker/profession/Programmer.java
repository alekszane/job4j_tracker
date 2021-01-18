package ru.job4j.tracker.profession;

import java.time.LocalDate;

public class Programmer extends Engineer {
    private String skill;

    public Programmer(String name, String surname, String education, LocalDate birthday, int category) {
        super(name, surname, education, birthday, category);
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
