package ru.job4j.ooa;

public class Airport {
    public static void main(String[] args) {
        final Airbus AIRBUS = new Airbus("A320");
        System.out.println(AIRBUS);
        AIRBUS.printModel();
        AIRBUS.printCountEngine();

        /*AIRBUS = new Airbus("A380");
        System.out.println(AIRBUS);
        */

        AIRBUS.setName("A380");
        System.out.println(AIRBUS);
        AIRBUS.printCountEngine();
    }
}
