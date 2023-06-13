package CreationalPatterns.SingletonPattern;

public class ExampleSingleton {
    // the class variable is null if no instance is instantiated
    private static ExampleSingleton uniqueInstance = null;

    private ExampleSingleton(){

    }

    // lazy construction of the instance

    public static ExampleSingleton getInstance() {
        if (uniqueInstance == null){
            uniqueInstance = new ExampleSingleton();
        }
        return uniqueInstance;
    }

    public void showMessage(){
        System.out.println("Hello!");
    }
}