package design.pattern.structual.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 工厂类
 * @Author: liyu
 * @Date: 2021/1/9
 */
public class EmployeeFactory {
    private static final Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department) {
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);
        if (manager == null) {
            System.out.println("创建 " + department + " 部门经理。");
            manager = new Manager(department);
            manager.setReportContent(department + "部门汇报内容xxx");
            EMPLOYEE_MAP.put(department, manager);
        }
        return manager;
    }
}
