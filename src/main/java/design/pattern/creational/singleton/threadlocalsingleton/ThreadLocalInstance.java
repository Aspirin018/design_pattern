package design.pattern.creational.singleton.threadlocalsingleton;

/**
 * ThreadLocal单例
 */
public class ThreadLocalInstance {
    private static final ThreadLocal<ThreadLocalInstance> instance
            = new ThreadLocal<ThreadLocalInstance>() {
        @Override
        protected ThreadLocalInstance initialValue() {
            return new ThreadLocalInstance();
        }
    };

    public static ThreadLocalInstance getInstance() {
        return instance.get();
    }

    private ThreadLocalInstance() {
    }
}
