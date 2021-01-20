package design.pattern.behavioral.observer;

import com.google.common.eventbus.EventBus;

public class GuavaTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus(); //事件总线
        GuavaEvent guavaEvent = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.post("POST的内容");
    }
}
