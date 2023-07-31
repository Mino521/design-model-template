package J2EEPatterns.TransferObjectPattern;

import java.util.ArrayList;
import java.util.List;

public class StudentBO {
    // pretend this list is a database
    List<StudentVO> students;

    public StudentBO(){
        students = new ArrayList<>();
        StudentVO student1 = new StudentVO("Robert",0);
        StudentVO student2 = new StudentVO("John", 1);
        students.add(student1);
        students.add(student2);
    }

    public List<StudentVO> getAllStudent(){
        return students;
    }

    public StudentVO getStudent(int rollNo){
        return students.get(rollNo);
    }

    public void updateStudent(StudentVO student){
        students.get(student.getRollNo()).setName(student.getName());
        System.out.println("Student: Roll No "+student.getRollNo()+", updated in the database");
    }
}
