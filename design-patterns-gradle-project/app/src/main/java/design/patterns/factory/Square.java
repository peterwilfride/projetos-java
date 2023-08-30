package design.patterns.factory;

import design.patterns.factory.Shape;

public class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square");
    }
}