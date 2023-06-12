package ss6_inheritance.exercise.exercise2;


import ss6_inheritance.exercise.exercise1.Circle;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        float x = scanner.nextFloat();
        System.out.println("Enter y");
        float y = scanner.nextFloat();
        Point2D point2D = new Point2D(x, y);
        System.out.println("Enter z");
        float z = scanner.nextFloat();
        Point3D point3D = new Point3D(x, y, z);
        System.out.println(point2D.toString());
        System.out.println(point3D.toString());

    }
}
