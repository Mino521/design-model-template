package BehaviouralPattern.ObserverPattern;

public class ObserverPatternDemo {
    // The observer pattern defines a one-to-many dependency relationship in which all of an object's dependents
    // are notified when its state changes and are automatically updated.
    //
    // The observer pattern contains the following core roles:
    //      Subject: Tt is an object with state and maintains a list of observers. Subjects provide methods for adding, removing, and notifying observers.
    //      Observer: An observer is an object that receives notifications from a topic. Observers need to implement an update method , when receiving notification of the subject , call the method to update the operation .
    //      Concrete Subject: Concrete Subject is the concrete implementation class of the subject. It maintains a list of observers and notifies observers when the state changes.
    //      Concrete Observer: Concrete Observer is the concrete implementation class of Observer. It implements the update method, which defines the specific actions to be performed when notified by the topic.
    //
    // Advantages:
    //      1, Observer and subject are abstractly coupled.
    //      2, Create a set of trigger mechanism.
    //
    // Disadvantages:
    //      1, if an observed object has many direct and indirect observers, it will take a lot of time to notify all of them.
    //      2, if there is a circular dependency between the observer and the observation target , the observation target will trigger a circular call between them , which may lead to a system crash.
    //      3, the observer pattern does not have a mechanism to let the observer know how the observed target object changes, but only knows that the observation target has changed.
    //
    // Note:
    //      1, JAVA already has a support class for the observer pattern.
    //      2, avoid circular references.
    //      3, if the sequential execution, an observer error will lead to system jamming, generally asynchronous way.
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
