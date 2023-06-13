package CreationalPatterns.SingletonPattern;
public class SingletonPatternDemo {
    public static void main(String[] args) {
        ExampleSingleton object = ExampleSingleton.getInstance();

        object.showMessage();
    }
}