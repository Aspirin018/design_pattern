package design.pattern.behavioral.strategy;

import org.springframework.beans.factory.support.InstantiationStrategy;
import org.springframework.core.io.Resource;

import java.util.Comparator;
import java.util.TreeMap;

public class Test {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//        String promotionKey = "LIJIAN";
//        if(StringUtils.equals(promotionKey, "LIJIAN")) {
//            promotionActivity = new PromotionActivity(new LijianPromotionStrategy());
//        } else if(StringUtils.equals(promotionKey, "MANJIAN")){
//            promotionActivity = new PromotionActivity(new ManjianPromotionStrategy());
//        } else {
//            promotionActivity = new PromotionActivity(new FanxianPromotionStrategy());
//        }
//        promotionActivity.executePromotionStrategy();
//    }

    public static void main(String[] args) {
        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();

//        Comparator
//        InstantiationStrategy
    }
}
