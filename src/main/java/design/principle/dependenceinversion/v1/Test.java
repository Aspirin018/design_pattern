package design.principle.dependenceinversion.v1;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.studyJavaCourse();
        student.studyFECourse();
        student.studyPythonCourse();
    }
}
