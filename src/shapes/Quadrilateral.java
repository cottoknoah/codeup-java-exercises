package shapes;

abstract class Quadrilateral extends Shape {

    protected double length;
    protected double width;

    public Quadrilateral(double l, double w){
        this.length = l;
        this.width = w;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }


    public abstract void setLength(double length);
    public abstract void setWidth(double width);

}
