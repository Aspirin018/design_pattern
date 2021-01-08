package design.pattern.structual.decorator.v1;

public class BattercakeWithEggSausage extends BattercakeWithEgg{
    @Override
    public String getDescription() {
        return super.getDescription() + "加一个香肠";
    }

    @Override
    public int cost() {
        return super.cost() + 2;
    }
}
