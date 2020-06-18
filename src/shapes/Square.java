package shapes;

public class Square extends Quadrilateral {

    public Square(double side) {
        super(side, side);
    }

//    @Override
//    public double getArea() {
//        return length * width;
//    }
//
//    @Override
//    public double getPerimeter() {
//        return this.length * 4;
//
//    }

    @Override
    public void setLength(double length) {
        this.length = 1;
    }

    @Override
    public void setWidth(double width) {

    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }
}
