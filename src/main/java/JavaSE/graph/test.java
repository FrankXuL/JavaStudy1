package JavaSE.graph;

import java.util.Scanner;

/**
 * @title: test
 * @Author Xu
 * @Date: 13/11/2022 下午 7:43
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println("三角形三边为:"+triangle.getSideA()+","+triangle.getSideB()+","+triangle.getSideC());
        System.out.println("该三角形面积为:"+triangle.getArea()+"周长为:"+triangle.getPerimeter());
        Lander lander = new Lander(2,4,4);
        System.out.println("该梯形上底,下底,高分别为"+lander.getOnBottom()+","+lander.getBottom()+","+lander.getHeight());
        System.out.println("该梯形面积为"+lander.getArea());
        Circle circle = new Circle(4);
        System.out.println("该圆形半径为:"+circle.getR());
        System.out.println("该圆形面积和周长分别为"+circle.getArea()+","+circle.getPerimeter());
    }
}