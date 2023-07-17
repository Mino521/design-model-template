package StructuralPatterns.FlyweightPattern;

public class FlyweightPatternDemo {
    // The Flyweight Pattern is used to reduce the number of objects created to reduce memory footprint and improve performance.
    //
    // Examples:
    //      1, JAVA String, if there is a same String then return it directly, if not then create a new string to be saved in the string cache pool.
    //      2, database connection pool.
    //
    // Advantages: greatly reduce the creation of objects, reduce the system's memory, so that the efficiency increases.
    // Disadvantages: improve the complexity of the system, need to separate the external state and internal state, and the external state has
    //      the nature of inherent, should not change with the internal state changes, otherwise it will cause confusion in the system.
    //
    // Usage scenarios:
    //      1. The system has a large number of similar objects.
    //      2. Scenarios that require buffer pools.
    // Note:
    //      1, pay attention to the division of external state and internal state, otherwise it may cause thread safety problems.
    //      2, these classes must have a factory object to be controlled.
    private static final String colors[] = { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        for(int i = 0; i < 20; ++i){
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    public static String getRandomColor(){
        return colors[(int)(Math.random()*colors.length)];
    }

    public static int getRandomX(){
        return (int)(Math.random()*100);
    }

    public static int getRandomY(){
        return (int)(Math.random()*100);
    }
}
