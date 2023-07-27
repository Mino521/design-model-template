package J2EEPatterns.BusinessDelegatePattern;

public class BusinessDelegatePatternDemo {
    // Business Delegate Pattern (BDP) is used to decouple the presentation layer and business layer. It is basically used to reduce
    // the communication or remote query functionality to the business layer code in the presentation layer code.
    //
    // In the business layer we have the following entities:
    //      Client:             The presentation layer code can be JSP, servlet or UI java code.
    //      Business Delegate:  An entry class for the client entity that provides access to the business service methods.
    //      LookUp Service:     The LookUp Service object is responsible for obtaining the relevant business implementation and providing business object access to the Business Delegate object.
    //      Business Service:   The business service interface. The entity class that implements the business service provides the actual business implementation logic.
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
