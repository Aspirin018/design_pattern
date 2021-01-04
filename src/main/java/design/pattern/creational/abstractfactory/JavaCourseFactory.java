package design.pattern.creational.abstractfactory;

/**
 * 组合视频和笔记的课程工厂
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Note getNote() {
        return new JavaNote();
    }
}
