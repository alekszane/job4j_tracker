package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
       Tracker tracker = new Tracker();
       tracker.add(new Item(3));
       tracker.add(new Item(2));
       tracker.add(new Item(1));
       System.out.println(tracker.findById(2).getId());
    }
}
