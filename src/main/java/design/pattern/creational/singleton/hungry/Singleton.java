package design.pattern.creational.singleton.hungry;

import java.io.Serializable;

/**
 * 饿汉式
 */
public class Singleton implements Serializable {
//    private final static Singleton singleton = new Singleton();

    private final static Singleton singleton;
    static {
        singleton = new Singleton();
    }
    public static Singleton getInstance() {
        return singleton;
    }

    private Singleton() {
    }

    private Object readResolve() {
        return singleton;
    }
}
