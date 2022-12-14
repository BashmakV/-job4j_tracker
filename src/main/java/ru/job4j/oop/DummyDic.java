package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic say = new DummyDic();
        String translation = say.engToRus("privet");
        System.out.println(translation);
    }
}
