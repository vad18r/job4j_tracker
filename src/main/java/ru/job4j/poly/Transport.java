package ru.job4j.poly;

public interface Transport {
    void go();

    void passengers(int amount);

    Double toFill(int amount);
}