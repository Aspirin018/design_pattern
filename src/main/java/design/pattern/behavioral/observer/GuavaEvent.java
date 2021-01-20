package design.pattern.behavioral.observer;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
    @Subscribe
    public void subscribe(String str){
        System.out.println("执行订阅方法，参数为：" + str);
    }
}
