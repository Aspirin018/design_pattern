package design.pattern.anotherstructual.proxy.dynamicproxy;

import design.pattern.anotherstructual.proxy.IOrderService;
import design.pattern.anotherstructual.proxy.Order;
import design.pattern.anotherstructual.proxy.OrderServiceImpl;
import org.apache.ibatis.binding.MapperProxyFactory;

public class Test {
    public static void main(String[] args) {
        IOrderService orderServiceProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        Order order = new Order();
        order.setUserId(2);
        orderServiceProxy.saveOrder(order);

//        ProxyFactoryBean
//        AopProxy
//        MapperProxyFactory
    }
}
