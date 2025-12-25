package SingletonPattern;
class LazySingleton {
    private static LazySingleton instance;

    // constructor
    private LazySingleton() {
    }
    
    // public method to get the instance
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    // to make it thread safe add the keyword synchronized in the getInstance()
};