package design.principle.dependenceinversion.v2;

public class Student {

    public void studyCourse(ICourse course) {
        course.study();
    }
}
