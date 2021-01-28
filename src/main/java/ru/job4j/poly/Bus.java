package ru.job4j.poly;

public class Bus implements Transport {
    boolean engine = true;
    int seats;
    @Override
    public void drive() {
        if (engine) {
            System.out.println("It's drive");
        }
    }

    @Override
    public void passengers(int num) {
        System.out.println("Seat " + seats + " passengers");
    }

    @Override
    public double price(double gallons) {
        double costGalon = 5.5;
        return gallons * costGalon;
    }
}
