package ru.job4j.oop;

public class Battery {
    private  int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery enother) {
        enother.load = enother.load + this.load;
        this.load -= this.load;
    }

    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(10);
       first.exchange(second);
        System.out.println(first.load);
        System.out.println(second.load);
    }
}
