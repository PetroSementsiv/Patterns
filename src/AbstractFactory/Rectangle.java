package AbstractFactory;

public class Rectangle implements IShape {
    @Override
    public void draw() {
        System.out.println("Inside Ractangle::draw() method");
    }
}
