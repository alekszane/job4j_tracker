package ru.job4j.oop.story;

public class Story {
    public static void main(String[] args) {
        System.out.println("Ball try run, animals try eaten ball");
        Ball ball = new Ball();
        Hare hare = new Hare();
        Wolf wolf = new Wolf();
        Fox fox = new Fox();
        System.out.println(ball.tryRun(hare.tryEat(ball)));
        System.out.println(ball.tryRun(wolf.tryEat(ball)));
        System.out.println(ball.tryRun(fox.tryEat(ball)));
        System.out.println("Ball is eaten, tadam!");
    }
}
