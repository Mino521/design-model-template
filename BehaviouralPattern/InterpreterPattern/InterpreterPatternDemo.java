package BehaviouralPattern.InterpreterPattern;

public class InterpreterPatternDemo {
    // Application examples: compilers, arithmetic expression calculations.
    //
    // Advantages:
    //      1, better extensibility, flexible.
    //      2, adds new ways of interpreting expressions.
    //      3, easy to implement simple grammar.
    //
    // Disadvantages:
    //      1, can be used in fewer scenarios.
    //      2, for complex grammar is more difficult to maintain.
    //      3, the interpreter mode can cause class inflation.
    //      4, the interpreter mode uses recursive invocation methods.
    //
    // Notice: the use of the scene is relatively small, JAVA if encountered can be replaced by expression4J.
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomenExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomenExpression();

        System.out.println("John is male ? "+isMale.interpret("John"));
        System.out.println("Julie is a married woman ? "+isMarriedWoman.interpret("Married Julie"));
    }
}
