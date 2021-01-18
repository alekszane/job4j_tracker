package ru.job4j.tracker.profession;

import java.time.LocalDate;

public class Doctor extends Profession {
    private String specific;
    

    public Doctor(String name, String surname, String education, LocalDate birthday, String specific) {
        super(name, surname, education, birthday);
        this.specific = specific;
    }

    public String getSpecific() {
        return specific;
    }

    public void setSpecific(String specific) {
        this.specific = specific;
    }

    public Diagnosis heal(Pacient pacient, Diagnosis diagnosis) {
       return diagnosis;
    }
}
