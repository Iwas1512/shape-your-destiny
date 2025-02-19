package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RightTriangleTest {
    
    @Test
    public void testRightTriangleArea() {
        RightTriangle triangle = new RightTriangle(3.0, 4.0);
        assertEquals(6.0, triangle.getArea(), 0.0001);
    }
    
    @Test
    public void testRightTrianglePerimeter() {
        RightTriangle triangle = new RightTriangle(3.0, 4.0);
    
        assertEquals(12.0, triangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testIsoscelesRightTriangleLike() {
        RightTriangle triangle = new RightTriangle(5.0, 5.0);
        assertEquals(12.5, triangle.getArea(), 0.0001);
        assertEquals(5.0 + 5.0 + Math.sqrt(50.0), triangle.getPerimeter(), 0.0001);
    }
    
   
 
    @Test
    public void testZeroBothLegs() {
        RightTriangle triangle = new RightTriangle(0.0, 0.0);
        assertEquals(0.0, triangle.getArea(), 0.0001);
        assertEquals(0.0, triangle.getPerimeter(), 0.0001);
    }
}