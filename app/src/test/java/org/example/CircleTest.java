package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CircleTest {
    
    @Test
    public void testCircleArea() {
        Circle circle = new Circle(5.0);
        assertEquals(Math.PI * 25.0, circle.getArea(), 0.0001);
    }
    
    @Test
    public void testCirclePerimeter() {
        Circle circle = new Circle(7.0);
        assertEquals(2 * Math.PI * 7.0, circle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testZeroRadius() {
        Circle circle = new Circle(0.0);
        assertEquals(0.0, circle.getArea(), 0.0001);
        assertEquals(0.0, circle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testSmallRadius() {
        Circle circle = new Circle(0.1);
        assertEquals(Math.PI * 0.01, circle.getArea(), 0.0001);
        assertEquals(2 * Math.PI * 0.1, circle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testLargeRadius() {
        Circle circle = new Circle(1000.0);
        assertEquals(Math.PI * 1000000.0, circle.getArea(), 0.0001);
        assertEquals(2 * Math.PI * 1000.0, circle.getPerimeter(), 0.0001);
    }
}