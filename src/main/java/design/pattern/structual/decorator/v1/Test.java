package design.pattern.structual.decorator.v1;

public class Test {
    public static void main(String[] args) {
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDescription() + ", 价格：" + battercake.cost());

        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDescription() + ", 价格：" + battercakeWithEgg.cost());

        BattercakeWithEggSausage battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDescription() + ", 价格：" + battercakeWithEggSausage.cost());
    }
}
