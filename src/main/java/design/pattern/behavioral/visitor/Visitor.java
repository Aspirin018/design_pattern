package design.pattern.behavioral.visitor;

/**
 * 访问者  对数据访问 并产生不同的行为，比如visit方法中可以打印excel报表等
 */
public class Visitor implements IVisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程" + codingCourse.getName() + "，价格" + codingCourse.getPrice());
    }
}
