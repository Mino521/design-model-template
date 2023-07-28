package J2EEPatterns.CompositeEntityPattern;

public class CompositeEntityPatternDemo {
    // The Composite Entity Pattern is used in the EJB persistence mechanism. A composite entity is an EJB entity bean that represents a graphical representation
    // of an object. When a composite entity is updated, the internal dependent object beans are automatically updated because they are managed by the EJB
    // entity bean.
    // The following are the participants of a composite entity bean:
    //      Composite Entity:      It is the main entity bean. it can be coarse-grained, or it can contain a coarse-grained object for continuous lifecycle.
    //      Coarse-Grained Object: This object contains dependent objects. It has its own lifecycle and can also manage the lifecycle of dependent objects.
    //      Dependent Object:      A Dependent Object is an object that depends on a Coarse-Grained Object for its continued lifecycle.
    //      Strategies:            Strategies represent how a combined entity is implemented.
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data 2");
        client.printData();
    }
}
