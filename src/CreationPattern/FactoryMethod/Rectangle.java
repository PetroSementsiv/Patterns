package CreationPattern.FactoryMethod;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside reactangle::draw() method");
    }
}
