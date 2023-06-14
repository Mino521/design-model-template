package CreationalPatterns.FactoryMethodPattern;

public class FactoryPatternDemo {
    // In the factory pattern, we create objects without exposing the creation logic to the client and by using a common interface to point to the newly created object.

    // The intention: define an interface for creating objects. Let its subclasses decide for themselves which factory class to instantiate.
    // The factory pattern defers its creation process to the subclasses.

    // Aim: The main aim is the choice of interface.

    // When to use: We explicitly plan for when different instances are created under different conditions.

    // Advantages:
    // 1. A caller wants to create an object, as long as he knows its name.
    // 2. High scalability. If you want to add a product, just extend a factory class.
    // 3. Hide the specific implementation of the product. The caller only care about the product interface.

    // Disadvantages:
    // Each time you add a product, you need to add a specific class and object implementation of the factory.
    // This makes the number of classes in the system increase exponentially.
    // To a certain extent this increases the complexity of the system and also increases the dependency of the system on specific classes.

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
