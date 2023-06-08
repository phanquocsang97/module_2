package ss4_oops.exercise.exercise1;

import java.util.Scanner;

public class MainQuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a :");
        double a = scanner.nextDouble();
        System.out.println("Nhập số b :");
        double b = scanner.nextDouble();
        System.out.println("Nhập số c :");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        System.out.println(quadraticEquation.getDiscriminant());
        ;
        double delta = quadraticEquation.getDiscriminant();
        if (a == 0) {
            System.out.println("Vui lòng nhập lại");
        } else {
            if (delta > 0) {
                System.out.println("Phương trình có nghiệm là " + quadraticEquation.getRoot1() + "và " + quadraticEquation.getRoot2());
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm là " + quadraticEquation.getRoot1());
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
