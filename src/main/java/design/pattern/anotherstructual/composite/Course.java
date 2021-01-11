package design.pattern.anotherstructual.composite;

/**
 * 课程
 */
public class Course extends CatalogComponent {
    private String name;
    private double price;

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return price;
    }

    @Override
    public void print() {
        System.out.println("Course name: " + name + " price: " + price);
    }

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }
}
