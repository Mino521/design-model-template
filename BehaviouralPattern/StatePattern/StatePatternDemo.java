package BehaviouralPattern.StatePattern;

public class StatePatternDemo {
    // In the State Pattern, the behaviour of an object depends on its state and can be changed according to its state.
    //
    // When to use it: The code contains a lot of conditional statements related to the state of the object.
    //
    // Advantages:
    //      1, Encapsulates the transformation rules.
    //      2, enumerate the possible states, before enumerating the state you need to determine the state type.
    //      3, put all the behaviours related to a state into a class, and can easily add new states, only need to change the object state to change the object's behaviour.
    //      4, allowing state transition logic and state objects into one , rather than a huge block of conditional statements.
    //      5, allows multiple environment objects to share a state object, thus reducing the number of objects in the system.
    //
    // Disadvantages:
    //      1, the use of state patterns will inevitably increase the number of system classes and objects.
    //      2, the structure and implementation of the state pattern is more complex, if not used properly will lead to confusion in the program structure and code.
    //      3, state mode on the "open and close principle" is not very good support. For state patterns that can switch states, adding new state classes requires
    //         modifying the source code of those responsible for state transitions. Otherwise, it is impossible to switch to the new state. Moreover, modifying the
    //         behaviour of a state class also requires modifying the source code of the corresponding class.
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
