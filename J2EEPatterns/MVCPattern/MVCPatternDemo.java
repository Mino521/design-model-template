package J2EEPatterns.MVCPattern;

public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retrieveStudentFromDatabase();

        StudentView studentView = new StudentView();

        StudentController controller = new StudentController(model, studentView);
        controller.updateView();

        controller.setStudentName("John");
        controller.updateView();
    }

    public static Student retrieveStudentFromDatabase(){
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
