package design.pattern.adapter.current;

import org.springframework.aop.framework.adapter.AdvisorAdapter;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.web.servlet.HandlerAdapter;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Test {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        powerAdapter.outputDC5V();

//        XmlAdapter
//        AdvisorAdapter
//        JpaVendorAdapter
//        HandlerAdapter
    }
}
