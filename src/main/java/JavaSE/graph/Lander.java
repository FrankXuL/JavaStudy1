package JavaSE.graph;

/**
 * @title: Lander
 * @Author Xu
 * @Date: 13/11/2022 下午 7:39
 * @Version 1.0
 */
public class Lander {
    private double OnBottom;
    private double bottom;
    private double height;
    private double area;

    public Lander(double onBottom, double bottom, double height) {
        OnBottom = onBottom;
        this.bottom = bottom;
        this.height = height;
        area = ((onBottom+bottom)*height)/2;
    }

    public double getOnBottom() {
        return OnBottom;
    }

    public void setOnBottom(double onBottom) {
        OnBottom = onBottom;
    }

    public double getBottom() {
        return bottom;
    }

    public void setBottom(double bottom) {
        this.bottom = bottom;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}