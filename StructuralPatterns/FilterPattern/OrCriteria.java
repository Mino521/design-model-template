package StructuralPatterns.FilterPattern;

import java.util.List;

public class OrCriteria implements Criteria{
    private Criteria criteria;
    private Criteria otherCriteria;

    public OrCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
        List<Person> secondCriteriaItems = otherCriteria.meetCriteria(persons);

        for(Person person : secondCriteriaItems){
            if(!firstCriteriaItems.contains(person))
                firstCriteriaItems.add(person);
        }
        return firstCriteriaItems;
    }
}
