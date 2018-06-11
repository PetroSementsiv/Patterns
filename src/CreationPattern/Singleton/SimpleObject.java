package CreationPattern.Singleton;

public class SimpleObject {
    private static SimpleObject instance = null;
    private SimpleObject(){}

    public static SimpleObject getInstance(){
        if(instance == null){
            instance = new SimpleObject();
        }
        return instance;
    }
    public void showMessage(){
        System.out.println("Hello Singleton");
    }
}
