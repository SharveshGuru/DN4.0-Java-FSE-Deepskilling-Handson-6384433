public class App {
    public static void main(String[] args){
        Student student = new Student("John Doe", "12345", "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);
        
        controller.updateView();

        controller.setStudentName("Ken Adams");
        controller.setStudentId("54321");   
        controller.setStudentGrade("B+");
        controller.updateView();
    }
}
