package CreationalPatterns.SingletonPattern;
public class SingletonPatternDemo {

    // The Singleton Pattern involves a single class that is responsible for creating its own objects,
    // while ensuring that only a single object is created. This class provides a way of accessing its
    // unique objects directly, without the need to instantiate objects of the class.
    //
    // Notice:
    // 1. A single instance class can only have one instance.
    // 2. The singleton class must create its own unique instance.
    // 3. The singleton class must provide this instance to all other objects.
    //
    // Intention: To ensure that a class has only one instance and to provide a global access point to access it.
    //
    // Primary solution: frequent creation and destruction of a globally used class.
    //
    // When to use: When you want to control the number of instances and save system resources.
    //
    // Advantages:
    // 1、Only one instance in memory, reducing memory overhead, especially with frequent creation and destruction of instances (e.g. managing the college home page cache).
    // 2. Avoid multiple occupation of resources (e.g. write file operations).
    //
    // Disadvantages:
    // No interface. No inheritance. Conflicts with the single responsibility principle.
    // A class should only care about the internal logic and not about how it is instantiated outside.

    public static void main(String[] args) {
        ExampleSingleton object = ExampleSingleton.getInstance();

        object.showMessage();
    }
}