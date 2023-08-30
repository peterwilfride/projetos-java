package design.patterns.factory;

import design.patterns.factory.Shape;

public class ShapeFactory {

    public Shape createRectangle() {
        return new Rectangle();
    }

    public Shape createSquare() {
        return new Square();
    }

    public Shape createCircle() {
        return new Circle();
    }
}