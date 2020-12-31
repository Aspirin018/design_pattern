package design.principle.liskovsubstitution.methodinput.correctexample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * 正确的案例：子类重载方法的入参比父类更宽松，符合里氏替换原则
 */
public class Test {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Map map = Collections.emptyMap();

        //1. Child
        Child child = new Child();

        //子类重写的方法被执行，入参是HashMap
        child.method(hashMap);

        //子类重载的方法被执行，入参是Map
        child.method(map);

        Base childOfBase = new Child();
        //子类重写的方法被执行，入参是HashMap
        child.method(hashMap);
        //子类重载的方法被执行，入参是Map
        child.method(map);

        //2. ChildWithoutOverride
        ChildWithoutOverride childWithoutOverride = new ChildWithoutOverride();
        //父类方法被执行, 入参是HashMap
        childWithoutOverride.method(hashMap);
        //子类重载的方法被执行，入参是Map
        childWithoutOverride.method(map);
    }
}
