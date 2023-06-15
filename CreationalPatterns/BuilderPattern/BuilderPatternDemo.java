package CreationalPatterns.BuilderPattern;

public class BuilderPatternDemo {
    // The Builder Pattern uses multiple simple objects to build a complex object step by step.
    //
    // The main scenario: In software systems, sometimes the creation of a complex object is faced.
    //                    It is usually composed of sub-objects of various parts using certain algorithms.
    //                    The various parts of this complex object are often subject to drastic changes due to changing requirements.
    //                    However, the algorithm used to put them together is relatively stable.
    //
    // Usage scenarios:
    //      1. The object to be generated has a complex internal structure.
    //      2. the internal properties of the object to be generated are themselves interdependent.
    //
    // Note: The difference with the factory pattern is that the builder pattern is more concerned with the order of assembly of parts.
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: "+vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: "+nonVegMeal.getCost());
    }
}
