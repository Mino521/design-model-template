package BehaviouralPattern.MediatorPattern;

public class MediatorPatternDemo {
    // A mediator object is used to encapsulate a series of object interactions, and the mediator makes
    // the objects loosely coupled by eliminating the need for them to explicitly reference each other,
    // and the interactions between them can be changed independently.
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hi! Robert!");
    }
}
