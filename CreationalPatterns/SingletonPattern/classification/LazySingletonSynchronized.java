package CreationalPatterns.SingletonPattern.classification;

public class LazySingletonSynchronized {
    // lazy initialization : YES
    // thread safety : YES

    // This approach has good lazy loading and works well in multiple threads, however,
    // it is inefficient and 99% of the time does not require synchronisation.
    // Pros: initialised on the first call to avoid memory wastage.
    // Disadvantage: must be locked synchronized to guarantee a single instance, but locking affects efficiency.
    // The performance of getInstance() is not critical to the application (this method is not used very often).
    private static LazySingletonSynchronized instance;
    private LazySingletonSynchronized (){}
    public static synchronized LazySingletonSynchronized getInstance() {
        if (instance == null) {
            instance = new LazySingletonSynchronized();
        }
        return instance;
    }
}
