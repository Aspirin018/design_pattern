package design.pattern.anotherstructual.proxy.dynamicproxy;


import design.pattern.anotherstructual.proxy.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class OrderServiceDynamicProxy implements InvocationHandler {
    //被代理的对象, 本案例中表示OrderServiceImpl
    private Object target;

    //构造
    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    //返回代理对象
    public Object bind() {
        //被代理对象的类型
        Class<?> aClass = target.getClass();
        //返回代理对象，第三个参数类型是InvocationHandler类型， 因此传this, 最终返回OrderServiceImpl的代理对象
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //从args中获取被代理方法的参数，在这里参数类型是Order
        Order arg = (Order) args[0];
        //前置增强
        beforeMethod(arg);
        //调用目标对象的目标方法，返回值类型转换
        int result = (int) method.invoke(target, args);
        //后置增强
        afterMethod();
        return result;
    }

    private void beforeMethod(Object obj) {
        System.out.println("动态代理before core");
        //这里的入参obj只是被代理方法saveOrder的入参，并不是被代理对象OrderServiceImpl
        if(obj instanceof Order) {
            Integer userId = ((Order) obj).getUserId();
            int dbRouter = userId % 2;
            System.out.println("动态代理分配到[db" + dbRouter + "]处理数据");
        }
    }

    private void afterMethod() {
        System.out.println("动态代理after core");
    }
}
