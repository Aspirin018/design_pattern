package design.principle.liskovsubstitution.v2;

public class Square implements Quadrangle {

    private int sideLength;

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getLength() {
        return sideLength;
    }

    @Override
    public int getWidth() {
        return sideLength;
    }
}
