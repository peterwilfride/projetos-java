package design.patterns.factory;

import design.patterns.factory.Shape;

public class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}