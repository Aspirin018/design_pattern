package design.principle.singleresponsibility.singleinter.v2;

public class CourseImpl implements CourseInfo, CourseManager{
    @Override
    public String getName() {
        return null;
    }

    @Override
    public byte[] getVideo() {
        return new byte[0];
    }

    @Override
    public void refundCourse() {

    }
}
