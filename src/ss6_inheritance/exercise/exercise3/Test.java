package ss6_inheritance.exercise.exercise3;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        float x = scanner.nextFloat();
        System.out.println("Enter y");
        float y = scanner.nextFloat();
        Point point = new Point(x, y);
        System.out.println(point.toString());
        System.out.println("Enter xSpeed");
        float xSpeed = scanner.nextFloat();
        System.out.println("Enter ySpeed");
        float ySpeed = scanner.nextFloat();
        MoveablePoint moveablePoint = new MoveablePoint(xSpeed, ySpeed, x, y);
        System.out.println(moveablePoint.toString());
    }
}
