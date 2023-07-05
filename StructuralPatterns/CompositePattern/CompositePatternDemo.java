package StructuralPatterns.CompositePattern;

public class CompositePatternDemo {
    // A composite pattern, which is the inclusion of other objects within an object.
    // These included objects may be endpoint objects (which no longer contain other objects) or non-endpoint objects (which also contain other objects within them, or group objects)
    // We refer to the objects as nodes, i.e. a root node contains many child nodes.
    // Some of the nodes no longer contain child nodes, while others still contain and so on.
    // This type of design pattern is a structural pattern, which creates a tree structure of groups of objects.
    //
    // Advantages:
    //     1. Simple to call from higher level modules.
    //     2. Nodes are freely added.
    // Disadvantages:
    //     When using the combination pattern, its leaves and branches are declared as implementing classes, not interfaces, violating the principle of inversion of dependencies.
    public static void main(String[] args) {
        Employee CEO = new Employee("John", "CEO", 30000);

        Employee headSales = new Employee("Robert", "Head Sales",  20000);
        Employee headMarketing = new Employee("Michel", "Head Marketing",  20000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        Employee clerk1 = new Employee("Laura", "Marketing", 10000);
        Employee clerk2 = new Employee("Bob", "Marketing", 10000);

        Employee salesExecutive1 = new Employee("Richard", "Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob", "Sales", 10000);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        printE(CEO);
    }

    private static void printE(Employee e){
        System.out.println(e);
        if(e.getSubordinates().size() != 0)
            for(Employee sub : e.getSubordinates()){
                printE(sub);
            }
    }
}
