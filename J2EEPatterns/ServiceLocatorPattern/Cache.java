package J2EEPatterns.ServiceLocatorPattern;

import java.util.ArrayList;
import java.util.List;

public class Cache {
    private final List<Service>services;

    public Cache(){
        services = new ArrayList<>();
    }

    public Service getService(String serviceName){
//        System.out.println(services.size());
        for(Service service: services){
//            System.out.println(service.getName() + serviceName);
            if(service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached "+serviceName+" object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exist = false;
        for(Service service:services){
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exist = true;
            }
        }
        if(!exist){
            services.add(newService);
        }
    }
}
