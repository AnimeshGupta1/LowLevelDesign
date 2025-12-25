package SingletonPattern;

public class EagerSingleton {
    // here we are eager to create an instance, without explicit synchronization

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}


