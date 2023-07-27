package J2EEPatterns.BusinessDelegatePattern;

public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if(serviceType.equalsIgnoreCase("EJB"))
            return new EJBService();
        return new JMSService();
    }
}
