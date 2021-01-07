package design.pattern.creational.singleton.doublecheck;

/**
 * 双检锁
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if(lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if(lazySingleton == null) {
                    /**
                     * 指令重排序
                     * 1. 分配内存给这个对象 2. 初始化对象 3. 设置引用指向对象
                     * 重排序后可能变成1-3-2
                     * 导致外层if判断不为空，最终返回一个未完全初始化的对象
                     */
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
