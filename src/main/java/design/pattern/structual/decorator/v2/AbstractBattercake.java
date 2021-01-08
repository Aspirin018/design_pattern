package design.pattern.structual.decorator.v2;

/**
 * 抽象的煎饼 要被装饰的类
 */
public abstract class AbstractBattercake {
    protected abstract String getDescription();

    protected abstract int cost();
}
