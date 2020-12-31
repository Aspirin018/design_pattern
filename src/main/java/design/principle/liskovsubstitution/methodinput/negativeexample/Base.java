package design.principle.liskovsubstitution.methodinput.negativeexample;

import java.util.Map;

/**
 * 基类
 */
public class Base {
    public void method(Map map) {
        System.out.println("父类方法被执行，入参是Map");
    }
}
