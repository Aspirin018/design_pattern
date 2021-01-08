package design.pattern.structual.decorator.v2;

import org.springframework.cache.transaction.TransactionAwareCacheDecorator;

import javax.servlet.http.HttpServletRequestWrapper;
import java.io.BufferedReader;

public class Test {
    public static void main(String[] args) {
        AbstractBattercake battercake;
        battercake = new Battercake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);
        System.out.println(battercake.getDescription() + ", 价格：" + battercake.cost());
//        BufferedReader
//        TransactionAwareCacheDecorator
//        HttpServletRequestWrapper

    }
}
