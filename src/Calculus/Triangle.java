package src.Calculus;

public class Triangle extends Polygon{

    double area;

    @Override
    public String toString() {
        return "Triangle{" +
                "Height=" + dim1 +
                ", Width=" + dim2 +
                ", Area=" + area +
                '}';
    }

    public Triangle(double dim1, double dim2) {
        super(dim1, dim2);
        this.area = (dim1 * dim2) / 2;
    }

    @Override
    public double getArea() {
        return dim1 * dim2 / 2;
    }
}
