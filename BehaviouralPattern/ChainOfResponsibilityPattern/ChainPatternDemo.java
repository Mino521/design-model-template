package BehaviouralPattern.ChainOfResponsibilityPattern;

public class ChainPatternDemo {
    // The Chain of Responsibility Pattern creates a chain of receiver objects for a request.
    // This pattern decouples the sender and receiver of the request given the type of request.
    // In this pattern, usually each receiver contains a reference to another receiver. If an object
    // is not able to handle the request, then it passes the same request to the next receiver and so on.
    //
    // Advantages:
    //      1, Reduces coupling. It decouples the sender and receiver of the request.
    //      2, Simplifies the object. So that the object does not need to know the structure of the chain.
    //      3, Enhances the flexibility of assigning responsibilities to objects. By changing the members
    //         of the chain or mobilising their order, it allows the dynamic addition or removal of responsibilities.
    //      4, Adding new request processing classes is easy.
    //
    // Disadvantages:
    //      1, Can not guarantee that the request will be received.
    //      2, The system performance will be affected to some extent, and it is not very convenient for code debugging, which may result in circular calls.
    //      3, It may not be easy to observe the characteristics of the runtime, hindering debug.
    //
    // Scenarios:
    //      1, There are multiple objects that can handle the same request, which object handles the request is automatically determined by the runtime.
    //      2, Submit a request to one of multiple objects without explicitly specifying the recipient.
    //      3, You can dynamically specify a group of objects to handle the request.
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROE);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is a debug information.");
        loggerChain.logMessage(AbstractLogger.ERROE, "This is an error information.");
    }
}
