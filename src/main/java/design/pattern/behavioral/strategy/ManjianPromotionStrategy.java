package design.pattern.behavioral.strategy;

/**
 * 满减策略
 */
public class ManjianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("满减策略");
    }
}
