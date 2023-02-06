package ru.job4j.checkstyle;

public class Broken {
    int sizeOfEmpty = 10;
    String name;
    String surname;
    final String newValue = "";

    void echo() {
    }

    void media(Object obj) {
        if (obj != null) {
            System.out.println(obj);
        }
    }

    public void method(int a, int b, int c, int d, int e, int f, int g) {
    }

    Broken() { }
}
