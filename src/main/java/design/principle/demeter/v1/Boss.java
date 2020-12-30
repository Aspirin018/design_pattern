package design.principle.demeter.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 老板
 */
public class Boss {

    /**
     * boss让teamLeader查看课程数量
     * @param leader
     */
    public void checkCourseNum(TeamLeader leader) {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            courses.add(new Course());
        }
        leader.checkCourse(courses);
    }
}
