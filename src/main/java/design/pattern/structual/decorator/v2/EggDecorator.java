package design.pattern.structual.decorator.v2;

/**
 * 装饰者实现类
 */
public class EggDecorator extends AbstractDecorator {
//    @Override
//    protected void doSomething() {
//    }

    @Override
    protected String getDescription() {
        return super.getDescription() + "加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }

    public EggDecorator(AbstractBattercake abstractBattercake) {
        super(abstractBattercake);
    }
}
