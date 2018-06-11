package AbstractFactory;

public abstract class AbstractFactory {
    abstract IColor getColor(String colortype);
    abstract IShape getShape(String shapetype);
}
