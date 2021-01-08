package design.pattern.adapter.classadapter;

/**
 * 具体的目标类
 */
public class ConcreteTarget  implements Target{
    @Override
    public void request() {
        System.out.println("concreteTarget的方法");
    }
}
