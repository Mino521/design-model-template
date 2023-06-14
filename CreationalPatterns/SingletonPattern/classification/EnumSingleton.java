package CreationalPatterns.SingletonPattern.classification;

public enum EnumSingleton {
    // lazy initialization : NO
    // thread safety : YES

    // This implementation has not been widely adopted.
    // However, it is the best way to implement the singleton pattern.
    // It is much cleaner, automatically supports serialisation mechanisms and absolutely prevents multiple instantiations.
    INSTANCE;
    public void anyMethod(){}
}
