package ru.job4j.oop;

public class Airplane implements Vehicle {
    @Override
    public void move() {
        System.out.println("Самолет летит");
    }

    @Override
    public void description() {
        System.out.println("Самолет это класс воздушных судов тяжелее воздуха, предназначенных для "
                + "полётов в атмосфере с помощью силового агрегата, создающего тягу");
    }
}
