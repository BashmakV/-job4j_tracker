package ru.job4j.oop;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point q = new Point(0, 0);
        Point w = new Point(2, 0);
        double out = q.distance(w);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus30to2Minus2then5dot38() {
        double expected = 5.38;
        Point q = new Point(-3, 0);
        Point w = new Point(2, -2);
        double out = q.distance(w);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when54to31then3dot60() {
        double expected = 3.60;
        Point q = new Point(5, 4);
        Point w = new Point(3, 1);
        double out = q.distance(w);
        Assert.assertEquals(expected, out, 0.01);
    }
}