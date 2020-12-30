package design.principle.dependenceinversion.v3;

import design.principle.dependenceinversion.v2.ICourse;

public class Student {
    private ICourse iCourse;

    public Student(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.study();
    }
}
