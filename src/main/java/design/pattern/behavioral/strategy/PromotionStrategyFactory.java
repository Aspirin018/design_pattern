package design.pattern.behavioral.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂
 */
public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    static {
        PROMOTION_STRATEGY_MAP.put("LIJIAN", new LijianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put("FANXIAN", new FanxianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put("MANJIAN", new ManjianPromotionStrategy());
    }

    //外部不能调用构造创建工厂
    private PromotionStrategyFactory() {
    }

    public static PromotionStrategy getPromotionStrategy(String promotionKey) {
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionKey);
        return promotionStrategy;
    }
}
