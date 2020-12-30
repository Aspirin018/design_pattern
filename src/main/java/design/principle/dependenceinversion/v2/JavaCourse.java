package design.principle.dependenceinversion.v2;

public class JavaCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("学生学习Java课程");
    }
}
