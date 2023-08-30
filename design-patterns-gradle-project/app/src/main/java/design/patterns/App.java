/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package design.patterns;

import design.patterns.singleton.SingletonClass;
import design.patterns.factory.ShapeFactory;
import design.patterns.factory.Shape;

import design.patterns.struturalPatterns._decorator.Rectangle;
import design.patterns.struturalPatterns._decorator.Triangle;
import design.patterns.struturalPatterns._decorator.RedShapeDecorator;

public class App {
    
    public static void main(String[] args) {
        
        // SINGLETON
        // error: SingletonClass() has private access in SingletonClass
        //SingletonClass object = new SingletonClass();

        /*SingletonClass object = SingletonClass.getInstance();

        String msg = object.sayHello();

        System.out.println(msg);*/

        // FATORY
        /*ShapeFactory shapeFactory = new ShapeFactory();

        Shape myRectangle = shapeFactory.createRectangle();
        myRectangle.draw();

        Shape mySquare = shapeFactory.createSquare();
        mySquare.draw();

        Shape myCircle = shapeFactory.createCircle();
        myCircle.draw();*/

        //ABSTRACT FACTORY

        //DECORATOR
        Shape rect = new Rectangle();
        Shape redTriangle = new RedShapeDecorator(new Triangle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        rect.draw();
        redTriangle.draw();
        redRectangle.draw();
    }
}
