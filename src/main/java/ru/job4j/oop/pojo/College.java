package ru.job4j.oop.pojo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Pypkin Vasya Viktorovich");
        student.setGroup("33A");
        student.setDateOfEntrance(new Date());
        System.out.format("Welcome, %s;" + System.lineSeparator() + "Your group: %s;"+ System.lineSeparator() + "Start date of learn: %tD;", student.getFullName(), student.getGroup(), student.getDateOfEntrance());
    }
}
