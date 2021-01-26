package design.pattern.behavioral.visitor;

/**
 * 免费课程
 */
public class FreeCourse extends Course{
    @Override
    public void accept(IVisitor visitor) {
        //todo 免费课程的访问权限判断
        visitor.visit(this);
    }
}
