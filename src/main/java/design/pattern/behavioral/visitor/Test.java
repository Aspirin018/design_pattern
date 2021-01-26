package design.pattern.behavioral.visitor;

import org.springframework.beans.factory.config.BeanDefinitionVisitor;

import java.nio.file.FileVisitor;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC");
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("设计模式");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course c : courseList) {
            c.accept(new Visitor());
        }

//        FileVisitor
        BeanDefinitionVisitor
    }
}
