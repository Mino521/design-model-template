package StructuralPatterns.ProxyPattern;

public class ProxyPatternDemo {
    // Advantages:
    //      1, clear responsibilities.
    //      2, High scalability.
    //      3, Intelligent.
    //
    // Disadvantages:
    //      1, Some types of proxy patterns may cause slower processing of requests due to the addition of proxy objects between the client and the real subject.
    //      2, Implementing proxy patterns requires extra work, and some proxy patterns are very complex to implement.
    //
    // Note:
    //      1, The difference from the adapter pattern:
    //              the adapter pattern mainly changes the interface of the object under consideration,
    //              while the proxy pattern can not change the interface of the class being proxied.
    //      2, The difference from the decorator pattern:
    //              decorator pattern in order to enhance the function,
    //              while the proxy pattern is to control.
    public static void main(String[] args) {
        Image image = new ProxyImage("test.jpg");

        // image will be loaded
        image.display();
        System.out.println("");
        // image do not need to be loaded
        image.display();
    }
}
