package design.pattern.creational.builder.v1;

public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("Java", "ppt", "video", "note", "qa");
        System.out.println(course);
    }
}
