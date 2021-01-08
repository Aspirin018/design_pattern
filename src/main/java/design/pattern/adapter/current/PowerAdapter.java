package design.pattern.adapter.current;

/**
 * 适配器
 */
public class PowerAdapter implements DC5 {
    private AC220 ac220 = new AC220();

    @Override
    public int outputDC5V() {
        int inputAC220V = ac220.outputAC220V();
        //变压器
        int outputDC5V = inputAC220V / 44;
        System.out.println("将" + inputAC220V + "V交流电适配成" + outputDC5V + "V直流电.");
        return outputDC5V;
    }
}
