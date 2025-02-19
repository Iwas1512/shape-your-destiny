package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    
    @Test
    public void testSquareArea() {
        Square square = new Square(5.0);
        assertEquals(25.0, square.getArea(), 0.0001);
    }
    
    @Test
    public void testSquarePerimeter() {
        Square square = new Square(5.0);
        assertEquals(20.0, square.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testSquareInheritsRectangle() {
        Square square = new Square(5.0);
        assertTrue(square instanceof Rectangle);
        
       
        Rectangle rect = square;
        assertEquals(rect.length, rect.width, 0.0001);
    }
    
    @Test
    public void testZeroSide() {
        Square square = new Square(0.0);
        assertEquals(0.0, square.getArea(), 0.0001);
        assertEquals(0.0, square.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testLargeSide() {
        Square square = new Square(1000.0);
        assertEquals(1000000.0, square.getArea(), 0.0001);
        assertEquals(4000.0, square.getPerimeter(), 0.0001);
    }
}