package design.pattern.behavioral.chainofresponsibility;

import javax.servlet.Filter;

public class Test {
    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();
        Course course = new Course();
        course.setName("设计模式");
        course.setArticle("手记");
        course.setVideo("视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
//        Filter
    }
}
