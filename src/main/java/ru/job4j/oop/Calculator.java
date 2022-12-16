package ru.job4j.oop;

public class Calculator {
    private static final int x = 5;

    public static int sum(int y) {
        return x + y;
    }
    public static int minus(int z) {
        return z - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int q) {
        return q / x;
    }
    public int sumAllOperation(int u) {
        return sum(u) + multiply(u) + minus(u) + divide(u);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sumAllOperation(10));
    }
}
