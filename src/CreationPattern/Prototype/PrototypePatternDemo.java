package CreationPattern.Prototype;

public class PrototypePatternDemo {
    public static void main(String [] args){
        ShapeCache.loadCache();
        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " +clonedShape.getType() );
        Shape clonedshape2 = (Shape) ShapeCache.getShape("2");
        System.out.println("Shape2: " + clonedshape2.getType());
    }
}
