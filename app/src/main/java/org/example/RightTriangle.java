package org.example;

public class RightTriangle extends Shape {
    protected double leg1, leg2;
    public RightTriangle(double leg1, double leg2) {
        this.leg1 = leg1;
        this.leg2 = leg2;
    }
    public double getArea() {
        return 0.5 * leg1 * leg2;
    }
    public double getPerimeter() {
        return leg1 + leg2 + Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }
}
