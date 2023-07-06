package StructuralPatterns.BridgePattern;

public class BridgePatternDemo {
    // Bridge is used to decouple abstraction from implementation, allowing the two to change independently.
    // This type of design pattern is a structural pattern that decouples abstraction and implementation by providing a bridge structure between the two.
    // This pattern involves an interface that acts as a bridge, making the entity class function independently of the interface implementation class.
    // The two types of classes can be structurally changed without affecting each other.
    //
    // Advantages:
    //      1. Separation of abstraction and implementation.
    //      2. Excellent scalability.
    //      3. Implementation details are transparent to the customer.
    //
    // Disadvantages:
    //      The introduction of the bridging pattern will make the system more difficult to understand and design.
    //      As the aggregated association relationship is built at the abstraction level, developers are required to design and program for the abstraction.
    //
    // Scenarios:
    //      1. If a system needs to add more flexibility between the abstraction and concretization roles of the components
    //         to avoid a static inheritance link between the two levels, the bridging pattern allows them to establish an association at the abstraction level.
    //      2. For those who do not want to use inheritance or because of multiple levels of inheritance resulting in a dramatic increase in the number of system classes,
    //         the bridging pattern is particularly suitable.
    //      3. There are two independently changing dimensions of a class, and both dimensions need to be extended.
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
