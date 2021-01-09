package design.pattern.structual.adapter.current;

/**
 * 被适配者 220V交流电
 */
public class AC220 {
    public int outputAC220V() {
        int output = 220;
        System.out.println("输出" + output + "V交流电。");
        return output;
    }
}
