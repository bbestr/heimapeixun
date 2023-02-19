package 抽象类;

public class Circle extends Shape{
    private double r;
    Double PI = Math.PI;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double area() {
        return this.r * this.r * PI;
    }
}
