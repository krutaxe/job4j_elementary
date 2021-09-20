package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when53to90then5() {
        double expected = 5;
        int x1 = 5;
        int y1 = 3;
        int x2 = 9;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when11to77then8() {
        double expected = 8.48;
        int x1 = 1;
        int y1 = 1;
        int x2 = 7;
        int y2 = 7;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to1314then19() {
        double expected = 19.10497;
        int x1 = 0;
        int y1 = 0;
        int x2 = 13;
        int y2 = 14;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.00001);
    }
}
