package design.principle.liskovsubstitution.methodoutput;

import java.util.HashMap;

public class Child extends Base {
    @Override
    public HashMap method() {
        System.out.println("子类的方法");
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("a", "子类的方法");
        return hashMap;
    }
}
