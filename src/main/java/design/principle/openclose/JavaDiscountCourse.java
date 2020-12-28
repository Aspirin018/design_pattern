package design.principle.openclose;

/**
 * JavaCourse实现类
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 重写父类方法
     *
     * @return
     */
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }

    public Double getOriginalPrice() {
        return super.getPrice();
    }
}
