package design.pattern.structual.facade;

/**
 * 物流子系统
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        //对接物流系统的逻辑
        System.out.println(pointsGift.getName()+"进入物流系统");
        String shippingOrderNo = "666"; //物流单号
        return shippingOrderNo;
    }
}
