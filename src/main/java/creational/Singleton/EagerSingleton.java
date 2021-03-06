package creational.Singleton;

public class EagerSingleton {
    private static volatile EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton(){}
    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
