package ru.job4j.oop;

public class Dog {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name + " eat " +  this.food);
    }

    public void eat(String food) {
        this.food = food;
    }
    public void giveNik(String nik) {
        this.name = nik;
    }

    public static void main(String[] args) {
        System.out.println("There are barbos's food");
        Dog barbos = new Dog();
        barbos.eat("bone");
        barbos.giveNik("Barbos");
        barbos.show();
        System.out.println("There are sharik's food");
        Dog sharik = new Dog();
        sharik.eat("meat");
        sharik.giveNik("Sharik");
        sharik.show();
    }
}
