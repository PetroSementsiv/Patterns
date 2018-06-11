package CreationPattern.AbstractFactory;

public class AbstractFactoryPatternDemo {
    public  static void main(String[] args){
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        IShape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        IShape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        IColor color1 = colorFactory.getColor("RED");
        color1.fill();
        IColor color2 = colorFactory.getColor("GREEN");
        color2.fill();
    }
}
