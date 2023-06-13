package ss7_interface_abstract_class.exercise.exercise1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println("Diện tích lúc đầu : " + circle.getCircleArea());
        circle.resize(60);
        System.out.println("Diện tích lúc sau : " + circle.getCircleArea());
        Rectangle rectangle = new Rectangle();
        System.out.println("Diện tích lúc đầu : " + rectangle.getRectangleArea());
        rectangle.resize(65);
        System.out.println("Diện tích lúc sau : " + rectangle.getRectangleArea());
        Square square = new Square();
        System.out.println("Diện tích ban đầu : " + square.getSquareArea());
        square.resize(70);
        System.out.println("Diện tích lúc sau : " + square.getSquareArea());
        Resizeable[] arrays = new Resizeable[3];
        arrays[0] = circle;
        arrays[1] = rectangle;
        arrays[2] = square;
        for (Resizeable value : arrays) {
            value.resize((Math.random() * 99 + 1));
        }
        System.out.println(Arrays.toString(arrays));
    }
}
