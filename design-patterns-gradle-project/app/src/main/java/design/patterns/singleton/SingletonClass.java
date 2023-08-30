package design.patterns.singleton;

public class SingletonClass {
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass(){}

    public static SingletonClass getInstance() {
        return instance;
    }

    public String sayHello() {
        return "Hello!";
    }
}