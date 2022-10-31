package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int minus(int y) {
        return y - x;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + divide(y) + multiply(y);
    }

    public static void main(String[] args) {
        int result = 0;
        System.out.println(Calculator.sum(5));
        System.out.println(Calculator.minus(10));
        Calculator calc = new Calculator();
        System.out.println(calc.divide(25));
        System.out.println(calc.multiply(2));
        System.out.println(calc.sumAllOperation(15));

    }
}