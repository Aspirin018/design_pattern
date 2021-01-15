package design.pattern.anotherstructual.proxy;

public class Order {
    private Object orderInfo;
    private Integer userId; //订单关联的用户

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
