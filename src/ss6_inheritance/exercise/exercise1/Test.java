package ss6_inheritance.exercise.exercise1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius :");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter color :");
        String b = scanner.nextLine();
        Circle circle = new Circle(a, b);
        System.out.println(circle.getArea());
        System.out.println("Enter height");
        double height = Double.parseDouble(scanner.nextLine());
        Cylinder cylinder = new Cylinder(a, b, height);
        System.out.println(cylinder.getVolume());
    }
}
