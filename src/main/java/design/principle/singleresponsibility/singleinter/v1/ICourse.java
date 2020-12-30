package design.principle.singleresponsibility.singleinter.v1;

/**
 * 非单一职责的接口
 */
public interface ICourse {
    String getName(); //获取课程名称
    byte[] getVideo(); //获取课程视频

    //退款课程 退款后将导致无法获取可能名称和课程视频
    void refundCourse();
}
