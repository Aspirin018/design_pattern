package design.pattern.creational.builder.v2;

public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java").buildCoursePPT("ppt")
                .buildCourseVideo("video").buildCourseNote("note").buildCourseQA("qa").build();
        System.out.println(course);
    }
}
