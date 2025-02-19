package org.example;

interface Polygon {
    int numberOfSides();
}

// the Polygon Interface
class PolygonRectangle extends Rectangle implements Polygon {
    public PolygonRectangle(double length, double width) {
        super(length, width);
    }
    public int numberOfSides() {
        return 4;
    }
}

class PolygonSquare extends Square implements Polygon {
    public PolygonSquare(double side) {
        super(side);
    }
    public int numberOfSides() {
        return 4;
    }
}

class PolygonRightTriangle extends RightTriangle implements Polygon {
    public PolygonRightTriangle(double leg1, double leg2) {
        super(leg1, leg2);
    }
    public int numberOfSides() {
        return 3;
    }
}

class PolygonIsoscelesRightTriangle extends IsoscelesRightTriangle implements Polygon {
    public PolygonIsoscelesRightTriangle(double leg) {
        super(leg);
    }
    public int numberOfSides() {
        return 3;
    }
}