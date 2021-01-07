package design.pattern.creational.singleton.reflection;

import java.io.Serializable;

/**
 * 饿汉式
 */
public class Singleton implements Serializable {

    private final static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return singleton;
    }

    private Singleton() {
        if (singleton != null) {
            throw new RuntimeException("单例构造器禁止反射调用！");
        }
    }

    private Object readResolve() {
        return singleton;
    }
}
