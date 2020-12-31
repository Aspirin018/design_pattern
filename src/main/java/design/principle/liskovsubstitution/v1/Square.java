package design.principle.liskovsubstitution.v1;

public class Square extends Rectangle{
    private int sideLength;

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public int getLength() {
        return getSideLength();
    }

    @Override
    public void setLength(int length) {
        setSideLength(length);
    }

    @Override
    public int getWidth() {
        return getSideLength();
    }

    @Override
    public void setWidth(int width) {
        setSideLength(width);
    }
}
