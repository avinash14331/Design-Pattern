package creational.Singleton;

public class LazySingleton {
    private static volatile LazySingleton lazySingleton;
    private LazySingleton(){}
    public static LazySingleton getLazySingleton(){

        if(lazySingleton==null)
            synchronized (LazySingleton.class) {
                if(lazySingleton==null)
                    lazySingleton = new LazySingleton();
            }
        return lazySingleton;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
