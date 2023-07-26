package BehaviouralPattern.StrategyPattern;

public class StrategyPatternDemo {
    // In the strategy pattern, a series of algorithms or strategies are defined and each algorithm is encapsulated in a separate class,
    // making them interchangeable. By using the strategy pattern, different algorithms can be selected at runtime as needed without modifying the client code.
    //
    // When to use: A system has many classes, and it is only their immediate behaviour that distinguishes them.
    //
    // Advantages:
    //      1, the algorithm can be freely switched.
    //      2, avoid using multiple conditional judgements.
    //      3, good scalability.
    //
    // Disadvantages:
    //      1, the strategy class will increase.
    //      2, all strategy classes need to be exposed to the public.
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+context.executeStrategy(10,5));

        context = new Context(new OperationSubtract());
        System.out.println("10 - 5 = "+context.executeStrategy(10,5));

        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = "+context.executeStrategy(10,5));
    }
}
