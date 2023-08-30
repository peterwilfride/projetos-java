package design.patterns.struturalPatterns._decorator;

imports design.patterns.struturalPatterns._decorator.ShapeDecorator;

public abstract class RedShapeDecorator implements ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border color: red");
    }
}