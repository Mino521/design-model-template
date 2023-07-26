package BehaviouralPattern.TemplatePattern;

public class TemplatePatternDemo {
    // In the Template Pattern, an abstract class openly defines the way or template for executing its methods. Its subclasses can override
    // the method implementations as needed, but the calls will be made in the manner defined in the abstract class.
    //
    // Note: To prevent malicious operations, the final keyword is added to the general template method.
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();

        game = new Football();
        game.play();
    }
}
