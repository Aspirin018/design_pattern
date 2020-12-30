package design.principle.singleresponsibility.singlecla.v1;

/**
 * 非单一职责的类
 */
public class Bird {
    public void mainMoveMode(String name) {
        if("鸵鸟".equals(name)) {
            System.out.println(name + "用脚走。");
        } else {
            System.out.println(name + "用翅膀飞。");
        }
    }
}
