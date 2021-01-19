package design.pattern.behavioral.templatemethod;

import org.apache.ibatis.executor.BaseExecutor;

import javax.servlet.http.HttpServlet;
import java.util.AbstractList;

public class Test {
    public static void main(String[] args) {
        System.out.println("设计模式课程start---");
        ACourse dpCourse = new DesignPatternCourse();
        dpCourse.makeCourse();
        System.out.println("设计模式课程end---");

        System.out.println("前端课程start---");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
        System.out.println("前端课程end---");

//        AbstractList
//        HttpServlet
//        BaseExecutor
    }
}
