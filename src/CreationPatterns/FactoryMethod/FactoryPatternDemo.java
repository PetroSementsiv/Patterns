package CreationPatterns.FactoryMethod;

public class FactoryPatternDemo {
    public static void main(String[] args){
    ShapeFactory shapeFactory = new ShapeFactory();
    IShape shape1= shapeFactory.getShape("circle");
    shape1.draw();
    IShape shape2 = shapeFactory.getShape("rectangle");
    shape2.draw();
    }
}
