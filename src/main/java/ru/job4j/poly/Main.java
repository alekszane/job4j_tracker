package ru.job4j.poly;

public class Main {
    public static void main(String[] args) {
        Vehicle train = new Train();
        Vehicle train1 = new Train();
        Vehicle plane = new Plane();
        Vehicle plane1 = new Plane();
        Vehicle car = new Car();
        Vehicle car1 = new Car();
        Vehicle[] vehicles = new Vehicle[]{train, plane, car, train1, plane1, car1};
        for (Vehicle veh: vehicles) {
            veh.move();
        }
    }
}
