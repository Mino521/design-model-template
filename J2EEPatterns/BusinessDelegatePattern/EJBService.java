package J2EEPatterns.BusinessDelegatePattern;

public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoke EJB Service");
    }
}
