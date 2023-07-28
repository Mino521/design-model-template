package J2EEPatterns.InterceptingFilterPattern;

public class InterceptingFilterDemo {
    // The Intercepting Filter Pattern (IFP) is used to do some preprocessing/post-processing of an application's request or response. Filters are defined
    // and applied to the request before passing it on to the actual target application. The filter can do authentication/authorisation/logging or track
    // the request and then pass the request to the appropriate handler.
    //
    // The following are the entities of this design pattern:
    //      Filter:          A filter performs certain tasks before or after the request handler executes the request.
    //      Filter Chain:    A filter chain has multiple filters that are executed in a defined order on a Target.
    //      Target:          The Target object is the request handler.
    //      Filter Manager:  The Filter Manager manages filters and filter chains.
    //      Client:          The Client is the object that sends requests to the Target object.
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
