package ru.job4j.poly;

public class Bus implements Transport {


    @Override
    public void drive() {
        System.out.println("Автобус едет");
    }

    @Override
    public void passengers(int quantity) {
        System.out.println("Количество пассажиров в автобусе");
    }

    @Override
    public int getRefuel(int[] liters) {
        return Transport.super.getRefuel(liters);
    }
}
