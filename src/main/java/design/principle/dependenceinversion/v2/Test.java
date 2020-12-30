package design.principle.dependenceinversion.v2;


public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        student.studyCourse(new JavaCourse());
        student.studyCourse(new FECourse());
    }
}
