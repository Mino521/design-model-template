package CreationalPatterns.SingletonPattern.classification;

public class DoubleCheckedLocking {
    // lazy initialization : YES
    // thread safety : YES

    // This approach uses a double locking mechanism, which is safe and maintains high performance in multi-threaded situations.
    // The performance of getInstance() is critical to the application.
    private volatile static DoubleCheckedLocking singleton;
    private DoubleCheckedLocking (){}
    public static DoubleCheckedLocking getSingleton() {
        if (singleton == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (singleton == null) {
                    singleton = new DoubleCheckedLocking();
                }
            }
        }
        return singleton;
    }
}
