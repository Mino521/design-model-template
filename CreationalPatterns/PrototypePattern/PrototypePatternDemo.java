package CreationalPatterns.PrototypePattern;

public class PrototypePatternDemo {

    // The Prototype Pattern is used to create duplicate objects while maintaining performance.
    // This pattern implements a prototype interface which is used to create a clone of the current object.
    // This pattern is used when it is more expensive to create objects directly.
    // For example, an object needs to be created after a costly database operation.
    // We can reduce the number of database calls by caching the object, returning its clone on the next request
    // and updating the database when needed.
    //
    // Advantages:
    //     1. Improved performance.
    //     2. Escapes the constraints of the constructor.
    //
    // Disadvantages:
    //     1. Equipping the clone method requires a thorough consideration of the functionality of the class. This is not difficult for brand-new classes.
    //        But for existing classes may not be very easy, especially when a class reference does not support serialization of indirect objects,
    //        or references contain a circular structure.
    //     2. The Cloneable interface must be implemented.
    //
    // Use scenarios:
    //     1. resource optimization scenarios.
    //     2. class initialization requires the digestion of a very large number of resources, which includes data, hardware resources, etc..
    //     3. performance and security requirements of the scene.
    //     4. If generating an object by new requires very cumbersome data preparation or access rights, the prototype pattern can be used.
    //     5. The scenario of multiple modifiers of an object.
    //     6. an object needs to provide access to other objects, and each caller may need to modify its value,
    //        you can consider using the prototype pattern to copy multiple objects for the caller to use.
    //     7. In practical projects, the prototype pattern rarely appears alone. It is usually found together with the factory method pattern.
    //        An object is created by the clone method and then provided to the caller by the factory method.
    //
    // Note: Unlike constructing a new object by instantiating a class, the prototype pattern generates a new object by copying an existing one.
    //       A shallow copy implements Cloneable overrides, while a deep copy reads a binary stream by implementing Serializable.

    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = ShapeCache.getShape("1");
        System.out.println("Shape : "+clonedShape.getType());

        Shape clonedShape2 = ShapeCache.getShape("2");
        System.out.println("Shape : "+clonedShape2.getType());

        Shape clonedShape3 = ShapeCache.getShape("3");
        System.out.println("Shape : "+clonedShape3.getType());
    }
}
