package ru.job4j.oop;

public class Freshman extends Student {
    public static void main(String[] args) {
        Freshman fresh = new Freshman();
        Student student = fresh;
        Object obj = student;
    }
}