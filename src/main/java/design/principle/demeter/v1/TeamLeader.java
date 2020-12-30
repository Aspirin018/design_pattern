package design.principle.demeter.v1;

import java.util.List;

/**
 * TeamLeader
 */
public class TeamLeader {
    public void checkCourse(List<Course> courses) {
        System.out.println(courses.size()
        );
    }
}
