package design.pattern.structual.decorator.v2;

/**
 * 要被装饰的实现类
 */
public class Battercake extends AbstractBattercake {
    @Override
    protected String getDescription() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
