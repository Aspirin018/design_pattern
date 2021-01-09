package design.pattern.structual.adapter.current;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.HandlerAdapter;
import org.springframework.web.servlet.mvc.Controller;

public class Test {
    public static void main(String[] args) {
        PowerAdapter powerAdapter = new PowerAdapter();
        powerAdapter.outputDC5V();

//        XmlAdapter
//        AdvisorAdapter
//        JpaVendorAdapter
//        HandlerAdapter
//        Controller
//        DispatcherServlet
    }
}
