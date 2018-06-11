package AbstractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    IColor getColor(String colortype) {
        return null;
    }

    @Override
    IShape getShape(String shapetype) {
        if (shapetype == null) {
            return null;
        }
        if (shapetype.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapetype.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        return null;
    }
}
