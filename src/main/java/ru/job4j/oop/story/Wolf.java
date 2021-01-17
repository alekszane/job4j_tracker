package ru.job4j.oop.story;

public class Wolf {
    public Boolean tryEat(Ball ball) {
        ball.setLife(true);
        return ball.isLife();
    }
}
