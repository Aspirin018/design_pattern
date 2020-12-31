package design.principle.liskovsubstitution.v2;


public class Process {

//    public static void resize(Quadrangle quadrangle) {
//        while(quadrangle.getWidth() <= quadrangle.getLength()) {
//            quadrangle.setWidth(quadrangle.getWidth() + 1);
//            System.out.println("length: " + quadrangle.getLength() + ", width: " + quadrangle.getWidth());
//        }
//        System.out.println("resize结束：长宽分别为：" + quadrangle.getLength() + ", " + quadrangle.getWidth());
//    }


    public static void resize(Rectangle rectangle) {
        while(rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
            System.out.println("length: " + rectangle.getLength() + ", width: " + rectangle.getWidth());
        }
        System.out.println("resize结束：长宽分别为：" + rectangle.getLength() + ", " + rectangle.getWidth());
    }

//    public static void main(String[] args) {
//        Square square = new Square();
//        square.setLength(5);
//        resize(square);
//    }

}
