package design.pattern.anotherstructual.proxy.staticproxy;

import design.pattern.anotherstructual.proxy.IOrderService;
import design.pattern.anotherstructual.proxy.Order;
import design.pattern.anotherstructual.proxy.OrderServiceImpl;

/**
 * 静态代理类
 */
public class OrderServiceStaticProxy {
    private IOrderService orderService; //声明目标对象

    public int saveOrder(Order order) {
        beforeMethod(order);
        orderService = new OrderServiceImpl();
        int result = orderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        System.out.println("静态代理before core");
        Integer userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到[db" + dbRouter + "]处理数据");
    }

    private void afterMethod() {
        System.out.println("静态代理after core");
    }
}
