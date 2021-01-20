package ru.job4j.oop.encapsulation;

/**
 * Encapsulation rules.
 * All fields - private!
 * Classes - public or private.
 * Methods - public or private.
 * If default or protected - replace public!
 */
public class Config {
    private String name;
    private int position;
    private String[] properties;

    public Config(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(position);
    }

    public String getProperty(String key) {
        return search(key);
    }

    private String search(String key) {
        return key;
    }
}
