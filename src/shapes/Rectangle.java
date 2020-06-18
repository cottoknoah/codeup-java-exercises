package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

//    protected double length;
//    protected double width;
//
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public double getArea(){ return length * width; }
//
//    public double getPerimeter(){
//        return (2 * length) + (2 * width);
//    }


    public Rectangle(double l, double w) {
        super(l, w);
    }

    @Override
    public double getLength() {
        return super.getLength();
    }

    @Override
    public double getWidth() {
        return super.getWidth();
    }

    @Override
    public void setLength(double length) {
        this.length = 1;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public void setWidth(double width) {
        this.width = 1;



    }
}
