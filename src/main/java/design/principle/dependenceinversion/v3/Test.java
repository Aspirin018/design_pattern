package design.principle.dependenceinversion.v3;

import design.principle.dependenceinversion.v2.JavaCourse;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(new JavaCourse());
        student.studyCourse();
    }
}
