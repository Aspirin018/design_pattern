package design.pattern.structual.decorator.v2;

/**
 * 装饰者实现类
 */
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }

//    @Override
//    protected void doSomething() {
//
//    }

    @Override
    protected String getDescription() {
        return super.getDescription() + "加一个香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
