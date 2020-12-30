package design.principle.demeter.v2;

import design.principle.demeter.v1.Course;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void checkCourse() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            courses.add(new Course());
        }
        System.out.println(courses.size());
    }
}
