package design.pattern.anotherstructual.proxy;

public class OrderServiceImpl implements IOrderService{
    private IOrderDao orderDao;
    @Override
    public int saveOrder(Order order) {
        orderDao = new OrderDaoImpl(); //实际业务中采用注入的方式
        System.out.println("Service层调用dao层添加order.");
        return orderDao.insert(order);
    }
}
