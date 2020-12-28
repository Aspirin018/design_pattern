package design.principle.openclose;

/**
 * 测试类
 */
public class TestOpenClose {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(9, "Java", 100d);
        System.out.println(javaCourse.toString());

    }
}
