package BehaviouralPattern.IteratorPattern;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        NameRespository nameRespository = new NameRespository();

        for(Iterator iterator = nameRespository.getIterator(); iterator.hasNext();){
            String name = (String) iterator.next();
            System.out.println("Name : "+name);
        }
    }
}
