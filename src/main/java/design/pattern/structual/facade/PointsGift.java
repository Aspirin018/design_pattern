package design.pattern.structual.facade;

/**
 * 用积分可以兑换的礼物
 */
public class PointsGift {
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
