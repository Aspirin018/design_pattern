package design.pattern.structual.decorator.v2;

/**
 * 抽象的装饰者
 */
public  class AbstractDecorator extends AbstractBattercake {
    private AbstractBattercake abstractBattercake;

    public AbstractDecorator(AbstractBattercake abstractBattercake) {
        this.abstractBattercake = abstractBattercake;
    }

//    protected abstract void doSomething();

    @Override
    protected String getDescription() {
        return this.abstractBattercake.getDescription();
    }

    @Override
    protected int cost() {
        return this.abstractBattercake.cost();
    }
}
