package creational.Singleton;

public class Driver {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton.toString());
        LazySingleton lazySingleton = LazySingleton.getLazySingleton();
        System.out.println(lazySingleton.toString());
    }
}
