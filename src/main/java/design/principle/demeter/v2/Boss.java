package design.principle.demeter.v2;

public class Boss {

    /**
     * boss让teamLeader查看课程数量
     * @param leader
     */
    public void checkCourseNum(TeamLeader leader) {
        leader.checkCourse();
    }
}
