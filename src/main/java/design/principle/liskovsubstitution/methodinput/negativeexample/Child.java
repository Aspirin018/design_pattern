package design.principle.liskovsubstitution.methodinput.negativeexample;

import java.util.HashMap;

/**
 * 子类不重写父类方法 只重载
 */
public class Child extends Base{
    public void method(HashMap hashMap) {
        System.out.println("子类方法被执行，入参是HashMap");
    }
}
