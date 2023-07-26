package BehaviouralPattern.NullObjectPattern;

public class NullPatternDemo {
    // In the Null Object Pattern, a null object replaces the checking of NULL object instances; instead of checking for null values,
    // a Null object reacts to a relationship that does nothing. Such a Null object can also provide default behaviour when data is not available.
    public static void main(String[] args) {
        AbstractCustomer customer1 = CustomerFactory.getCustomer("Rob");

    }
}
