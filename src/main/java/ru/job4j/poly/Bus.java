package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {

    }

    @Override
    public int passengers() {
        return 0;
    }

    @Override
    public int getRefuel(int[] liters) {
        return Transport.super.getRefuel(liters);
    }
}
