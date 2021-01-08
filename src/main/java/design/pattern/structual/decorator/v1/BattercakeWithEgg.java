package design.pattern.structual.decorator.v1;

public class BattercakeWithEgg extends Battercake {
    @Override
    public String getDescription() {
        return super.getDescription() + ", 加一个鸡蛋";
    }

    @Override
    public int cost() {
        return super.cost() + 1;
    }
}
