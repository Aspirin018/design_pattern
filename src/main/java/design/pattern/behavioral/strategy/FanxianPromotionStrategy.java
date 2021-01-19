package design.pattern.behavioral.strategy;

/**
 * 返现策略
 */
public class FanxianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现促销");
    }
}
