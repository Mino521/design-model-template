package J2EEPatterns.DataAccessObjectPattern;

public class DAOPatternDemo {
    // The DAO pattern is used to separate low-level data access APIs or operations from high-level business services.
    // The following are the participants of the Data Access Object pattern:
    //      Data Access Object Interface:       This interface defines the standard operations to be performed on a model object.
    //      Data Access Object concrete class:  This class implements the above interface. This class is responsible for retrieving data from a data source, which may be a database, xml, or other storage mechanism.
    //      Model Object/Value Object:          This object is a simple POJO that contains get/set methods to store the data retrieved by using the DAO class.
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAOImpl();

        for(Student student : studentDAO.getAllStudent()){
            System.out.println("Student: [RollNo: "+student.getRollNo()+", Name: "+student.getName()+" ].");
        }

        Student student = studentDAO.getAllStudent().get(0);
        student.setName("Michael");
        studentDAO.updateStudent(student);

        student = studentDAO.getStudent(0);
        System.out.println("Student: [RollNo: "+student.getRollNo()+", Name: "+student.getName()+" ].");
    }
}
