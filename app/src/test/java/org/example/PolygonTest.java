package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class PolygonTest {
    
   
    @Test
    public void testPolygonRectangleNumberOfSides() {
        PolygonRectangle rectangle = new PolygonRectangle(5.0, 10.0);
        assertEquals(4, rectangle.numberOfSides());
    }
    
    @Test
    public void testPolygonRectangleArea() {
        PolygonRectangle rectangle = new PolygonRectangle(5.0, 10.0);
        assertEquals(50.0, rectangle.getArea(), 0.0001);
    }
    
    @Test
    public void testPolygonRectanglePerimeter() {
        PolygonRectangle rectangle = new PolygonRectangle(5.0, 10.0);
        assertEquals(30.0, rectangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testPolygonRectangleInheritance() {
        PolygonRectangle rectangle = new PolygonRectangle(5.0, 10.0);
        assertTrue(rectangle instanceof Rectangle);
        assertTrue(rectangle instanceof Polygon);
    }
    
  
    @Test
    public void testPolygonSquareNumberOfSides() {
        PolygonSquare square = new PolygonSquare(5.0);
        assertEquals(4, square.numberOfSides());
    }
    
    @Test
    public void testPolygonSquareArea() {
        PolygonSquare square = new PolygonSquare(5.0);
        assertEquals(25.0, square.getArea(), 0.0001);
    }
    
    @Test
    public void testPolygonSquarePerimeter() {
        PolygonSquare square = new PolygonSquare(5.0);
        assertEquals(20.0, square.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testPolygonSquareInheritance() {
        PolygonSquare square = new PolygonSquare(5.0);
        assertTrue(square instanceof Square);
        assertTrue(square instanceof Polygon);
    }
    
  
    @Test
    public void testPolygonRightTriangleNumberOfSides() {
        PolygonRightTriangle triangle = new PolygonRightTriangle(3.0, 4.0);
        assertEquals(3, triangle.numberOfSides());
    }
    
    @Test
    public void testPolygonRightTriangleArea() {
        PolygonRightTriangle triangle = new PolygonRightTriangle(3.0, 4.0);
        assertEquals(6.0, triangle.getArea(), 0.0001);
    }
    
    @Test
    public void testPolygonRightTrianglePerimeter() {
        PolygonRightTriangle triangle = new PolygonRightTriangle(3.0, 4.0);
        assertEquals(12.0, triangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testPolygonRightTriangleInheritance() {
        PolygonRightTriangle triangle = new PolygonRightTriangle(3.0, 4.0);
        assertTrue(triangle instanceof RightTriangle);
        assertTrue(triangle instanceof Polygon);
    }
    

    @Test
    public void testPolygonIsoscelesRightTriangleNumberOfSides() {
        PolygonIsoscelesRightTriangle triangle = new PolygonIsoscelesRightTriangle(5.0);
        assertEquals(3, triangle.numberOfSides());
    }
    
    @Test
    public void testPolygonIsoscelesRightTriangleArea() {
        PolygonIsoscelesRightTriangle triangle = new PolygonIsoscelesRightTriangle(5.0);
        assertEquals(12.5, triangle.getArea(), 0.0001);
    }
    
    @Test
    public void testPolygonIsoscelesRightTrianglePerimeter() {
        PolygonIsoscelesRightTriangle triangle = new PolygonIsoscelesRightTriangle(5.0);
        double expectedPerimeter = 5.0 + 5.0 + (5.0 * Math.sqrt(2));
        assertEquals(expectedPerimeter, triangle.getPerimeter(), 0.0001);
    }
    
    @Test
    public void testPolygonIsoscelesRightTriangleInheritance() {
        PolygonIsoscelesRightTriangle triangle = new PolygonIsoscelesRightTriangle(5.0);
        assertTrue(triangle instanceof IsoscelesRightTriangle);
        assertTrue(triangle instanceof Polygon);
    }
}