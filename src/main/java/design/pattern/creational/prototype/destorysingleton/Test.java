package design.pattern.creational.prototype.destorysingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Singleton singleton = Singleton.getInstance();
        Method method = singleton.getClass().getDeclaredMethod("clone");
        method.setAccessible(true);
        Singleton clonedSingleton = (Singleton) method.invoke(singleton);
        System.out.println(singleton);
        System.out.println(clonedSingleton);

//        Object
//        Cloneable
//        ArrayList
//        HashMap
    }
}
