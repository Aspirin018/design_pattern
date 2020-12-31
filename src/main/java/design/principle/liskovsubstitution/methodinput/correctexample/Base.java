package design.principle.liskovsubstitution.methodinput.correctexample;

import java.util.HashMap;

/**
 * 基类
 */
public class Base {
    public void method(HashMap map) {
        System.out.println("父类方法被执行, 入参是HashMap");
    }
}
