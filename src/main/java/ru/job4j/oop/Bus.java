package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Автобус едет по скоростной трассе");
    }

    @Override
    public void description() {
        System.out.println("Автобус это безрельсовое механическое моторное транспортное средство, технически"
                + " предназначенное для перевозки девяти и более пассажиров");
    }
}
