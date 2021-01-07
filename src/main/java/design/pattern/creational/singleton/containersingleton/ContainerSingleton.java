package design.pattern.creational.singleton.containersingleton;


import org.apache.commons.lang.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 容器单例
 */
public class ContainerSingleton {
    private static Map<String, Object> singletonMap = new HashMap<String, Object>();
    public static void putInstance(String key, Object instance){
        if(StringUtils.isNotBlank(key) && instance!= null) {
            if(!singletonMap.containsKey(key)) {
                singletonMap.put(key,instance);
            }
        }
    }
    public static Object getInstance(String key) {
        return singletonMap.get(key);
    }

    private ContainerSingleton() {
    }
}
