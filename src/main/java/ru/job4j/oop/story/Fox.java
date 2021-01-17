package ru.job4j.oop.story;

public class Fox {
    public Boolean tryEat(Ball ball) {
        ball.setLife(false);
        return ball.isLife();
    }
}
