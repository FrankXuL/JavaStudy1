package JavaSE.graph;

/**
 * @title: Circle
 * @Author Xu
 * @Date: 13/11/2022 下午 7:42
 * @Version 1.0
 */
public class Circle {
    private double r;
    private double perimeter;
    private double area;

    public Circle(double r) {
        this.r = r;
        perimeter = 2 * 3.14 * r;
        area = 3.14 * r * r;
    }

    public double getR() {
        return r;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }
}