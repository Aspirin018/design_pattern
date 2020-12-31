package design.principle.liskovsubstitution.methodinput.negativeexample;

import java.util.HashMap;

/**
 * 反面教材：子类重载方法的入参比父类入参更严格，违反了里氏替换原则
 */
public class Test {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        Child child = new Child();
        //子类方法被执行，入参是HashMap
        child.method(hashMap);
    }
}
