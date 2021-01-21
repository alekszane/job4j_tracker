package ru.job4j.oop.pojo;

public class Library {
    public static void main(String[] args) {
        Book java = new Book("Head start Java", 320);
        Book code = new Book("Clean code", 540);
        Book kotlin = new Book("Kotlin tutorial", 610);
        Book python = new Book("Python tutorial", 520);
        Book[] books = new Book[4];
        books[0] = java;
        books[1] = code;
        books[2] = kotlin;
        books[3] = python;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getNumberPages() + " pages");
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        System.out.println("Replace null and third elements");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println(book.getName() + " - " + book.getNumberPages() + " pages");
        }
        System.out.println("Show only Clean code book!");
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println(book.getName() + " - " + book.getNumberPages() + " pages");
            }
        }
    }
}
