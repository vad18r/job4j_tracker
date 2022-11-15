package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void go() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int amount) {
        System.out.println("Количество пассажиров " + amount);
    }

    @Override
    public Double toFill(int amount) {
        return amount * 31.5;
    }
}