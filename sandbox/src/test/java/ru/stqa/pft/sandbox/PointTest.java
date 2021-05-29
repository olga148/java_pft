package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTest {

    @Test
    public void distance() {
        Point p1 = new Point(4, 10);
        Point p2 = new Point(0, 13);
        Assert.assertEquals(p1.distance(p2), 5.0);
    }

    @Test
    public void distance1() {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(5, 5);
        Assert.assertEquals(p1.distance(p2), 0);
    }

    @Test
    public void distance2() {
        Point p1 = new Point(8, 4);
        Point p2 = new Point(2, 10);
        Assert.assertEquals(p1.distance(p2), 8,485281374);
    }
}
