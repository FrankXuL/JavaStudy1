package JavaSE.graph;

/**
 * @title: Triangle
 * @Author Xu
 * @Date: 13/11/2022 下午 7:36
 * @Version 1.0
 */
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    private double area;
    private double perimeter;
    private boolean isTriangle;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.perimeter = sideA + sideB + sideC;
        double p = this.perimeter;
        this.area = Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideC));
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }
}