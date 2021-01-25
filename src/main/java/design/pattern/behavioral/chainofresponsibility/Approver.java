package design.pattern.behavioral.chainofresponsibility;

/**
 * 批准者
 */
public abstract class Approver {
    protected Approver approver; //包含自己同样类型的对象
    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }
    //发布课程
    public abstract void deploy(Course course);
}
