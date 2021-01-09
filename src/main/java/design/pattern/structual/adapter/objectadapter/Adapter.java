package design.pattern.structual.adapter.objectadapter;

/**
 * 适配器
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    /**
     * 把目标类Target的request方法适配成被适配者的方法
     */
    @Override
    public void request() {
        //Adaptee 被适配者的方法
        adaptee.adapteeRequest();
    }
}
