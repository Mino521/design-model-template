package StructuralPatterns.FilterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaPatternDemo {
    // The Filter pattern allows developers to filter a set of objects using different criteria,
    // linking them in a decoupled way through logical operations. This type of design pattern is a
    // structural pattern that combines multiple criteria to obtain a single criterion.
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person("Robert", "Male", "Single"));
        persons.add(new Person("John", "Male", "Married"));
        persons.add(new Person("Laura", "Female", "Married"));
        persons.add(new Person("Diana", "Female", "Single"));
        persons.add(new Person("Mike", "Male", "Single"));
        persons.add(new Person("Bobby", "Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingles: ");
        printPersons(single.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for(Person person : persons){
            System.out.println("Person : [ Name : "+person.getName()+", Gender : "+person.getGender()+", Marital Status : "+person.getMaritalStatus()+" ]");
        }
    }
}
