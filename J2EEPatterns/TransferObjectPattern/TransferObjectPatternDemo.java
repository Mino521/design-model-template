package J2EEPatterns.TransferObjectPattern;

public class TransferObjectPatternDemo {
    // The Transfer Object Pattern is used to pass data with multiple attributes from the client to the server at once.
    // A Transfer Object is also known as a Numeric Object. A Transfer Object is a simple POJO class with getter/setter
    // methods that is serializable, so it can be transferred over the network. It does not have any behaviour. Server-side
    // business classes typically read data from the database, populate the POJO, and either send it to the client or pass
    // it by value. For the client, the transport object is read-only. The client can create its own transport object and
    // pass it to the server to update the values in the database all at once.
    //
    // The following are the entities of this design pattern:
    //      Business Object: A business service that populates the data for the Transfer Object.
    //      Transfer Object: Simple POJO with only methods to set/get properties.
    //      Client:          A client can send requests or send a Transfer Object to a Business Object.
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();

        for(StudentVO student : studentBO.getAllStudent()){
            System.out.println("Student: [RollNo : "+student.getRollNo()+", Name: "+student.getName()+" ]");
        }

        StudentVO student = studentBO.getAllStudent().get(0);
        student.setName("Michael");
        studentBO.updateStudent(student);

        studentBO.getStudent(0);
        System.out.println("Student: [RollNo : "+student.getRollNo()+", Name: "+student.getName()+" ]");
    }
}
