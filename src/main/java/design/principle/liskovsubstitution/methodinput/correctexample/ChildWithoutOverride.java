package design.principle.liskovsubstitution.methodinput.correctexample;

import java.util.Map;

/**
 * 子类不重写父类方法 只重载
 */
public class ChildWithoutOverride extends Base{

    public void method(Map map) {
        System.out.println("子类重载的方法被执行，入参是Map");
    }
}
