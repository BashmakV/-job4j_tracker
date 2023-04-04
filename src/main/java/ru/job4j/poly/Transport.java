package ru.job4j.poly;

public interface Transport {
    void drive();

    int passengers();

    default int getRefuel(int[] liters) {
        int price = 0;
        for (int liter : liters) {
            price += liter;
        }
        return price;
    }

}
