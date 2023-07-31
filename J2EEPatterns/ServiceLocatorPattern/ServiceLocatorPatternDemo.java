package J2EEPatterns.ServiceLocatorPattern;

public class ServiceLocatorPatternDemo {
    // The Service Locator Pattern is used when we want to locate services using JNDI queries. Given the high cost of looking up
    // JNDI for a service, the Service Locator Pattern takes advantage of caching techniques. The first time a service is requested,
    // the service locator looks up the service in JNDI and caches the service object. When the same service is requested again,
    // the service locator looks it up in its cache, which can greatly improve application performance.
    //
    // The following are the entities of this design pattern:
    //      Service:            The service that actually handles the request. References to such services can be found in the JNDI server.
    //      Initial Context:    The JNDI Context with a reference to the service to be looked up.
    //      Service Locator:    The Service Locator is a single point of contact for obtaining a service through the JNDI Lookup and Cache service.
    //      Cache:              The cache stores references to services in order to reuse them.
    //      Client :            A Client is an object that invokes a service through the ServiceLocator.
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
