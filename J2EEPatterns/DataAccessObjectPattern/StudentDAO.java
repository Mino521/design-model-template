package J2EEPatterns.DataAccessObjectPattern;

import java.util.List;

public interface StudentDAO {
    List<Student> getAllStudent();
    Student getStudent(int rollNo);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
