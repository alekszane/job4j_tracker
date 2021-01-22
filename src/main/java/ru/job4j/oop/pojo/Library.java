package ru.job4j.oop.pojo;

import java.util.Arrays;

public class Library {

    public static void main(String[] args) {
        Book java = new Book("Head start Java", 320);
        Book code = new Book("Clean code", 540);
        Book kotlin = new Book("Kotlin tutorial", 610);
        Book python = new Book("Python tutorial", 520);
        Book[] books = new Book[6];
        books[0] = java;
        books[1] = code;
        books[2] = kotlin;
        books[3] = python;
        Arrays.stream(books).map(book -> book.getName() + " - " + book.getNumberPages() + " pages").forEach(System.out::println);
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Replace null and third elements");
        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getNumberPages() + " pages");
        }
        System.out.println("Show only Clean code book!");
        for (Book book : books) {
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getNumberPages() + " pages");
            }
        }
    }
}
