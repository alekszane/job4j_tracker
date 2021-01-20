package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;

public class StartUI {

    public static void main(String[] args) {
        Item item1 = new Item();
        /* DateTimeFormatter - format DateTime, method ofPattern*/
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
        System.out.println(item1.getCreated().format(formatter));
    }
}
