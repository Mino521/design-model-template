package CreationalPatterns.SingletonPattern.classification;

public class LazySingleton {
    // lazy initialization : YES
    // thread safety : NO

    // This is the most basic implementation. The biggest problem with this implementation is that it does not support multi-threading.
    // It is not strictly a singleton pattern because it is not locked and synchronized.
    // This lazy loading is obvious, does not require thread safety and does not work properly in multi-threaded situations.
    private static LazySingleton instance;
    private LazySingleton (){}

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
