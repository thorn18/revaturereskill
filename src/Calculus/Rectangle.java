package src.Calculus;

public class Rectangle extends Polygon{

    double area;

    @Override
    public String toString() {
        return "Rectangle{" +
                "Height=" + dim1 +
                ", Width=" + dim2 +
                ", Area=" + area +
                '}';
    }

    public Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
        this.area = dim1*dim2;
    }
}
