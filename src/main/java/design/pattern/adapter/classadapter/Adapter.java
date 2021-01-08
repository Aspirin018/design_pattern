package design.pattern.adapter.classadapter;

/**
 * 适配器
 */
public class Adapter extends Adaptee implements Target{
    /**
     * 把目标类Target的request方法适配成被适配者的方法
     */
    @Override
    public void request() {
        //Adaptee 被适配者的方法
        super.adapteeRequest();
    }
}
