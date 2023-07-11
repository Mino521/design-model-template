package StructuralPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria{
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersions = new ArrayList<>();
        for(Person person : persons){
            if(person.getGender().equalsIgnoreCase("MALE"))
                malePersions.add(person);
        }
        return malePersions;
    }
}
