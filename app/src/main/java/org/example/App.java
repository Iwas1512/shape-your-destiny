// Author @Anlil Iwas, Date: 02/18/25

package org.example;

public class App {
  public static void main(String[] args) {

    System.out.println("Hello! Welome to my Shape Lab, We will be diving into Inheritance and Abstract :) ");


    Shape circle = new Circle(5);
    System.out.println("Circle Area: " + circle.getArea());
    System.out.println("Circle Perimeter: " + circle.getPerimeter());

    Shape rectangle = new Rectangle(4, 6);
    System.out.println("Rectangle Area: " + rectangle.getArea());
    System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

    Shape rightTriangle = new RightTriangle(3, 4);
    System.out.println("Right Triangle Area: " + rightTriangle.getArea());
    System.out.println("Right Triangle Perimeter: " + rightTriangle.getPerimeter());

    Shape square = new Square(4);
    System.out.println("Square Area: " + square.getArea());
    System.out.println("Square Perimeter: " + square.getPerimeter());

    Polygon polygonRectangle = new PolygonRectangle(4, 6);
    System.out.println("Polygon Rectangle Sides: " + polygonRectangle.numberOfSides());

    Polygon polygonSquare = new PolygonSquare(4);
    System.out.println("Polygon Square Sides: " + polygonSquare.numberOfSides());

    Polygon polygonRightTriangle = new PolygonRightTriangle(3, 4);
    System.out.println("Polygon Right Triangle Sides: " + polygonRightTriangle.numberOfSides());

    Polygon polygonIsoscelesRightTriangle = new PolygonIsoscelesRightTriangle(5);
    System.out.println("Polygon Isosceles Right Triangle Sides: " + polygonIsoscelesRightTriangle.numberOfSides());



    System.out.println("Thats all! Goodbye :)");
}
  
}
