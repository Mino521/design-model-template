package CreationalPatterns.SingletonPattern.classification;

public class StaticInnerClass {
    // lazy initialization : YES
    // thread safety : YES

    // This approach achieves the same effect as the double-checked locking approach, but is simpler to implement.
    // When using delayed initialisation for static domains, this approach should be used instead of the double-check locking approach.
    // This approach is only applicable in the case of static domains.
    // The double-check locking approach can be used when an instance domain requires delayed initialisation.
    // This approach also makes use of the classloader mechanism to ensure that there is only one thread when the instance is initialised,
    // unlike the Eager Singleton where the instance is instantiated as soon as the Singleton class is loaded (without the lazy loading effect).
    // In this way, the Singleton class is loaded, but the instance is not necessarily initialised.
    // This is because the SingletonHolder class is not actively used.
    // The SingletonHolder class is only explicitly loaded when the getInstance method is explicitly called, thus instantiating the instance.
    // On the other hand, if you don't want to instantiate the Singleton class when it is loaded, because you can't be sure that the Singleton class will be actively used elsewhere and thus loaded,
    // then instantiating the instance is obviously not the right time. In this case, this approach makes sense compared to the third approach.
    private static class StaticInnerClassHolder {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }
    private StaticInnerClass (){}
    public static StaticInnerClass getInstance() {
        return StaticInnerClassHolder.INSTANCE;
    }
}
