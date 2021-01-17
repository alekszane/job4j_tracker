package ru.job4j.oop;

public class Battery {
    private  int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery enother) {
        this.load = this.load - enother.load;
        enother.load = enother.load + this.load;
    }

    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(40);
        first.exchange(second);
        System.out.println(first.load);
        System.out.println(second.load);
    }
}
