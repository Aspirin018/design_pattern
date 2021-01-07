package design.pattern.creational.singleton.threadlocalsingleton;


import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Thread thread1 = new Thread(new Task());
        Thread thread2 = new Thread(new Task());
        thread1.start();
        thread2.start();
        System.out.println("main thread: " + ThreadLocalInstance.getInstance());
        System.out.println("main thread: " + ThreadLocalInstance.getInstance());
        System.out.println("main thread: " + ThreadLocalInstance.getInstance());


//        Desktop
//        AbstractFactoryBean
//        ErrorContext
    }

    public static class Task implements Runnable {

        @Override
        public void run() {
            ThreadLocalInstance instance = ThreadLocalInstance.getInstance();
            System.out.println(instance);
        }
    }
}
