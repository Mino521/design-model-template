package CreationalPatterns.SingletonPattern.classification;

public class EagerSingleton {
    // lazy initialization : NO
    // thread safety : YES

    // This approach is more commonly used, but is prone to generating rubbish objects.
    // Pros: No locking, execution will be more efficient.
    // Cons: Classes are initialised on load, which wastes memory.
    // It is based on the classloader mechanism and avoids the synchronisation problem of multi-threading.
    // However, instance is instantiated when the class is loaded, and although there are various reasons for class loading,
    // most of them are calls to the getInstance method in the singleton pattern,
    // it is not certain that there is any other way (or any other static method) to cause the class to be loaded.
    // Initialising the instance at this point clearly does not achieve the effect of lazy loading.
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton (){}
    public static EagerSingleton getInstance() {
        return instance;
    }
}
