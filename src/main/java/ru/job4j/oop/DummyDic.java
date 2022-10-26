package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String word = "Неизвестное слово. " + eng;
        return word;
    }

    public static void main(String[] args) {
        DummyDic dummy = new DummyDic();
        String dic = dummy.engToRus("asasas");
        System.out.println(dic);
    }
}
