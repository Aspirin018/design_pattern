package design.pattern.creational.builder.v1;

/**
 * 建造者抽象类
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseNote(String courseNote);
    public abstract void buildCourseQA(String courseQA);
    public abstract Course makeCourse();
}
