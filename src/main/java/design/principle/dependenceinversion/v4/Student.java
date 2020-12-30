package design.principle.dependenceinversion.v4;

import design.principle.dependenceinversion.v2.ICourse;

public class Student {
    private ICourse iCourse;

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyCourse() {
        iCourse.study();
    }
}
