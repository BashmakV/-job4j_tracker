package ru.job4j.cast;

public class Usage {
    public static void main(String[] args) {
        Vehicle plane = new Plane();
        Vehicle plane2 = new Plane();
        Vehicle bus = new Bus();
        Vehicle bus2 = new Bus();
        Vehicle train = new Train();
        Vehicle train2 = new Train();

        Vehicle[] vehicles = new Vehicle[] {plane, plane2, bus, bus2,
        train, train2};
        for (Vehicle t : vehicles) {
            t.move();
        }
    }
}
