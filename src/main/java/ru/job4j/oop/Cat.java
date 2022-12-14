package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        Cat black = new Cat();

        black.eat("fish");
        gav.eat("kotleta");

        gav.giveNick("gav");
        black.giveNick("black");

        gav.show();
        black.show();
    }
}
