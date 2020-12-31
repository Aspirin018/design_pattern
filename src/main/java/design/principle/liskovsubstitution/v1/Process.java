package design.principle.liskovsubstitution.v1;

public class Process {
    public static void resize(Rectangle rectangle) {
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("length: " + rectangle.getLength() + ", width: " + rectangle.getWidth());
        }
        System.out.println("resize结束：长宽分别为：" + rectangle.getLength() + ", " + rectangle.getWidth());
    }

    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setLength(10);
//        rectangle.setWidth(5);
//        resize(rectangle );
        Square square = new Square();
        square.setLength(5);
        resize(square);
    }
}
