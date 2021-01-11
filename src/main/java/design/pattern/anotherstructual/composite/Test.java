package design.pattern.anotherstructual.composite;

import org.apache.ibatis.scripting.xmltags.SqlNode;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux课程", 1);
        CatalogComponent winCourse = new Course("Win课程", 2);

        CatalogComponent javaCatalog = new CourseCatalog("java课程目录", 2);

        CatalogComponent dpCourse = new Course("designPattern课程", 3);
        CatalogComponent redisCourse = new Course("redis课程", 4);
        javaCatalog.add(dpCourse);
        javaCatalog.add(redisCourse);

        CatalogComponent mainCatalog = new CourseCatalog("所有课程主目录", 1);
        mainCatalog.add(linuxCourse);
        mainCatalog.add(winCourse);
        mainCatalog.add(javaCatalog);

        mainCatalog.print();

//        Container
//        HashMap
//        ArrayList
//        SqlNode
    }
}
