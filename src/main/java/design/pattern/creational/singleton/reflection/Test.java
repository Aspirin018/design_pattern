package design.pattern.creational.singleton.reflection;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 反射攻击
 */
public class Test {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Singleton singleton = Singleton.getInstance();
        Class singletonClass = Singleton.class;
        Constructor constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Object reflectSingleton = constructor.newInstance();

        System.out.println(singleton);
        System.out.println(reflectSingleton);
        System.out.println(singleton == reflectSingleton);
    }
}
