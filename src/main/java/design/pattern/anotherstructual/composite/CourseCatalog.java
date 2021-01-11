package design.pattern.anotherstructual.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * 课程目录
 */
public class CourseCatalog extends CatalogComponent {
    private String name;
    private List<CatalogComponent> items = new ArrayList<>();
    private Integer level;

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return name;
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent component : items) {
            if (level != null) {
                for (int i = 0; i < level; i++) {
                    System.out.print("   ");
                }
            }
            component.print();
        }
    }

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }
}
