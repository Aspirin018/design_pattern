package design.pattern.behavioral.strategy;

/**
 * 立减策略
 */
public class LijianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("立减促销");
    }
}
