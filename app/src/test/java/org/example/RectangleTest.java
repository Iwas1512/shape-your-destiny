package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RectangleTest {
    
    @Test
    public void testRectangleArea() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(50.0, rectangle.getArea(), 0.0001);
    }
    
    @Test
    public void testRectanglePerimeter() {
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        assertEquals(30.0, rectangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testSquareLikeRectangle() {
        Rectangle rectangle = new Rectangle(7.0, 7.0);
        assertEquals(49.0, rectangle.getArea(), 0.0001);
        assertEquals(28.0, rectangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testZeroDimension() {
        Rectangle rectangle = new Rectangle(0.0, 5.0);
        assertEquals(0.0, rectangle.getArea(), 0.0001);
        assertEquals(10.0, rectangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testZeroBothDimensions() {
        Rectangle rectangle = new Rectangle(0.0, 0.0);
        assertEquals(0.0, rectangle.getArea(), 0.0001);
        assertEquals(0.0, rectangle.getPerimeter(), 0.0001);
    }
}