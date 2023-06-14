package CreationalPatterns.AbstractFactoryPattern;

import CreationalPatterns.FactoryMethodPattern.Shape;

public class AbstractFactoryPatternDemo {

    // The Abstract Factory Pattern is about creating other factories around a super factory.
    // This superfactory is also known as the factory of other factories.
    // In the Abstract Factory Pattern, the interfaces are the factories responsible for creating an object of interest without explicitly specifying their class.
    // Each generated factory can provide objects according to the factory pattern.

    // Intention: To provide an interface for creating a series of related or interdependent objects without specifying their specific classes.

    // Primary solution: The primary solution to the problem of interface selection.

    // When to use: A system has more than one product family and the system only consumes products from one of these families.

    // Pros: When multiple objects in a product family are designed to work together, it ensures that clients always use only objects from the same product family.

    // Cons: Product family extensions are very difficult, and adding a family of a particular product requires code to be added both in the abstract Creator and in the concrete.

    public static void main(String[] args) {

        // get Shape Factory
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        // get object with shape circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // call circle's draw method
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        // get Color Factory
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

        // get object with color red
        Color color1 = colorFactory.getColor("RED");

        // call red's fill method
        color1.fill();

        Color color2 = colorFactory.getColor("GREEN");
        color2.fill();

        Color color3 = colorFactory.getColor("BLUE");
        color3.fill();
    }
}
