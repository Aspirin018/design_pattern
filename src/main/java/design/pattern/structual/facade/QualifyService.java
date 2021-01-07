package design.pattern.structual.facade;

/**
 * 校验是否可以积分兑换礼物的子系统
 */
public class QualifyService {
    /**
     * 校验是否有兑换资格
     *
     * @param pointsGift
     * @return
     */
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + "积分资格通过吗，库存通过");
        return true;
    }
}
