package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд едет по рельсам");
    }

    @Override
    public void description() {
        System.out.println("Поезд это сформированный и сцеплённый состав, состоящий из группы вагонов, "
                + "с одним или несколькими действующими локомотивами");
    }
}
