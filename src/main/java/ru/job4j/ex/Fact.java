package ru.job4j.ex;

public class Fact {
    public static void main(String[] args) {
    int test = 0;
        System.out.println(calc(test));
    }

    public static int calc(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Метод вызывается с некорректными параметрами");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
