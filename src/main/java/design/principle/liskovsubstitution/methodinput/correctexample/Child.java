package design.principle.liskovsubstitution.methodinput.correctexample;

import java.util.HashMap;
import java.util.Map;

/**
 * 子类重写 & 重载
 */
public class Child extends Base {
    @Override
    public void method(HashMap map) {
        System.out.println("子类重写的方法被执行，入参是HashMap");
    }

    public void method(Map map) {
        System.out.println("子类重载的方法被执行，入参是Map");
    }
}
