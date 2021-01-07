package design.pattern.creational.singleton.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 懒汉式
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private static boolean flag = true; //true表示可以实例化
    private LazySingleton() {
        if(flag){
            flag = false;
        } else {
            throw new RuntimeException("单例构造器禁止反射调用！");
        }
    }
    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        LazySingleton singleton = LazySingleton.getInstance();
        Class singletonClass = LazySingleton.class;
        Constructor constructor = singletonClass.getDeclaredConstructor();
        constructor.setAccessible(true);

        Field flag = singletonClass.getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(singleton, true);
        Object reflectSingleton = constructor.newInstance();

        System.out.println(singleton);
        System.out.println(reflectSingleton);
        System.out.println(singleton == reflectSingleton);
    }
}
