package StructuralPatterns.DecoratorPattern;

public class DecoratorPatternDemo {
    // The Decorator Pattern allows new functionality to be added to an existing object without
    // changing its structure. This pattern creates a decorated class that wraps the original class
    // and provides additional functionality while maintaining the integrity of the class method signature.
    //
    // The main scenario: In general, we often use inheritance to implement a class in order to extend it.
    //                    Since inheritance introduces static features to the class, and as the extended functionality
    //                    increases, the subclasses can be bloated.
    // When to use: Extending a class when you don't want to add many subclasses.
    //
    // Advantages: Decoration class and decorated classes can develop independently and will not be coupled with each other,
    //             the decoration pattern is an alternative to inheritance, the decoration pattern can dynamically extend
    //             the functionality of an implemented class.
    // Disadvantages: multi-layer decoration is more complex.
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
