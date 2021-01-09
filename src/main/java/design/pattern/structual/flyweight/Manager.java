package design.pattern.structual.flyweight;

/**
 * @Description: TODO
 * @Author: liyu
 * @Date: 2021/1/9
 */
public class Manager implements Employee {
    private String department; //部门
    private String reportContent;

    @Override
    public void report() {
        System.out.println(reportContent);
    }

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}
