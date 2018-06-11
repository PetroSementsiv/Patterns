package CreationPattern.Singleton;

public class SingletonPatternDemo {

public static void main(String [] args) {
    SimpleObject object = SimpleObject.getInstance();
    object.showMessage();
    SimpleObject teo = SimpleObject.getInstance();
    teo.showMessage();
    }
}
