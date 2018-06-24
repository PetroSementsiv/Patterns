package StructuralPatterns.Adapter.Decorator;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
