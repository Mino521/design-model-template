package J2EEPatterns.DataAccessObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO{
    // pretend this is a database
    List<Student> students;
    public StudentDAOImpl(){
        students = new ArrayList<>();
        Student student1 = new Student("Robert",0);
        Student student2 = new Student("John",1);
        students.add(student1);
        students.add(student2);
    }
    @Override
    public List<Student> getAllStudent() {
        return students;
    }

    @Override
    public Student getStudent(int rollNo) {
        return students.get(rollNo);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student Roll No: "+student.getRollNo()+", updated in the database.");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getRollNo());
        System.out.println("Student Roll No: "+student.getRollNo()+", deleted from database.");
    }
}
