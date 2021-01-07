package design.pattern.structual.facade;

import org.apache.ibatis.session.Configuration;
import org.springframework.jdbc.support.JdbcUtils;

public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("键盘");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
//        JdbcUtils
//        Configuration
    }
}
