package StructuralPatterns.FacadePattern;

public class FacadePatternDemo {
    // The Facade Pattern hides the complexity of the system and provides the client with an interface
    // through which the client can access the system. This pattern involves a single class that provides
    // simplified methods for client requests and delegated calls to existing system class methods.
    //
    // Main purpose: to reduce the complexity when accessing internal subsystems of complex systems and to simplify the interface between clients.
    //
    // When to use: 1. the client does not need to know the complex connections within the system, the whole system only needs to provide a "receptionist".
    //              2. To define the entry point to the system.
    //
    // Benefits: 1. Reduces system interdependencies.
    //           2. Increased flexibility.
    //           3. Increased security.
    // Disadvantages: Does not comply with the open-close principle. If you want to change something, it would be very troublesome. Inheritance and Override are not suitable.
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
