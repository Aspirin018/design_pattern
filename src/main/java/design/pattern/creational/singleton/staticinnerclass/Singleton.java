package design.pattern.creational.singleton.staticinnerclass;

/**
 * 静态内部类的方式
 */
public class Singleton {
   private static class InnerClass{
       private static Singleton singleton = new Singleton();
   }
   public static Singleton getInstance(){
       return InnerClass.singleton;
   }

    private Singleton() {
    }
}
