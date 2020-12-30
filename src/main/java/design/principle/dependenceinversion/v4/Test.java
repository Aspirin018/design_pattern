package design.principle.dependenceinversion.v4;

import design.principle.dependenceinversion.v2.FECourse;
import design.principle.dependenceinversion.v2.JavaCourse;

public class Test {

    public static void main(String[] args) {
        Student student = new Student();
        student.setiCourse(new JavaCourse());
        student.studyCourse();
        student.setiCourse(new FECourse());
        student.studyCourse();
    }
}
