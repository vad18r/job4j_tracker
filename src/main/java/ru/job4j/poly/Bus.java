package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passergers(int num) {
        System.out.println("Количество пассажиров " + num);
    }

    @Override
    public Double toFill(int kol) {
        return kol * 31.5;
    }
}
