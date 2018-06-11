package CreationPattern.AbstractFactory;

public class ColorFactory extends AbstractFactory{

    @Override
    IColor getColor(String colortype) {
        if(colortype.equalsIgnoreCase("RED")){
            return new Red();
        }else if (colortype.equalsIgnoreCase("GREEN")){
            return new Green();
        }
        return null;
    }

    @Override
    IShape getShape(String shapetype) {
        return null;
    }
}
