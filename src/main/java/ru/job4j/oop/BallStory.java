package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare zay = new Hare();
        Wolf volk = new Wolf();
        Fox lis = new Fox();
        zay.tryEat(kolobok);
        volk.tryEat(kolobok);
        lis.tryEat(kolobok);
    }
}
