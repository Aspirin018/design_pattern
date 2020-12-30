package design.principle.dependenceinversion.v2;

public class FECourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学生学习前端课程");
    }
}
