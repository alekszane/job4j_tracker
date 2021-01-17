package ru.job4j.oop.story;

public class Ball {
    private boolean life;

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }

    public boolean tryRun(boolean life) {
        return !this.life;
    }
}
