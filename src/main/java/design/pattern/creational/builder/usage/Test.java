package design.pattern.creational.builder.usage;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;

import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) {
        Cache<Object, Object> cache = CacheBuilder.newBuilder().initialCapacity(1000)
                .maximumSize(10000).expireAfterAccess(12, TimeUnit.HOURS).concurrencyLevel(5).build();

//        BeanDefinitionBuilder
//        SqlSessionFactoryBuilder
    }
}
