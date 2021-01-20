package ru.job4j.oop.pojo;

import java.time.LocalDate;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Pypkin Vasya Viktorovich");
        student.setGroup("33A");
        student.setDateOfEntrance(LocalDate.now());
        System.out.format(" Welcome, %s;\n Your group: %s;\n Start date of learn: %tD;", student.getFullName(), student.getGroup(), student.getDateOfEntrance());
    }
}
