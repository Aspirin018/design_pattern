package design.pattern.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供Java源代码");
    }

    @Override
    protected boolean needWriteArticle() {
        return true;
    }
}
