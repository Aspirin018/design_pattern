package design.pattern.creational.prototype.destorysingleton;

/**
 * 饿汉式
 */
public class Singleton implements Cloneable {
    private final static Singleton singleton;

    static {
        singleton = new Singleton();
    }

    public static Singleton getInstance() {
        return singleton;
    }

    private Singleton() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        return getInstance();
    }
}
