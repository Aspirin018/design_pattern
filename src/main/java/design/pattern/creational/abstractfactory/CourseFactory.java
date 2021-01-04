package design.pattern.creational.abstractfactory;

/**
 * 产品族工厂接口
 */
public interface CourseFactory {
    Video getVideo();

    Note getNote();
}
