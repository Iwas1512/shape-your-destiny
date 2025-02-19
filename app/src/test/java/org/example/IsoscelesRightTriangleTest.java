package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class IsoscelesRightTriangleTest {
    
    @Test
    public void testIsoscelesRightTriangleArea() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(5.0);
        assertEquals(12.5, triangle.getArea(), 0.0001);
    }
    
    @Test
    public void testIsoscelesRightTrianglePerimeter() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(5.0);
        assertEquals(5.0 + 5.0 + (5.0 * Math.sqrt(2)), triangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testIsoscelesRightTriangleInheritsRightTriangle() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(5.0);
        assertTrue(triangle instanceof RightTriangle);
        
       
        RightTriangle rt = triangle;
        assertEquals(rt.leg1, rt.leg2, 0.0001);
    }
    
    @Test
    public void testZeroLeg() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(0.0);
        assertEquals(0.0, triangle.getArea(), 0.0001);
        assertEquals(0.0, triangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testSmallLeg() {
        IsoscelesRightTriangle triangle = new IsoscelesRightTriangle(0.1);
        assertEquals(0.005, triangle.getArea(), 0.0001);
        assertEquals(0.2 + (0.1 * Math.sqrt(2)), triangle.getPerimeter(), 0.0001);
    }
}
