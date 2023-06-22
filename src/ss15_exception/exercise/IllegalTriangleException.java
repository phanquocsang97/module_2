package ss15_exception.exercise;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TriangleCheck check = new TriangleCheck();
        try {
            System.out.println("Nhập cạnh thứ nhất");
            int a = scanner.nextInt();
            System.out.println("Nhập cạnh thứ hai");
            int b = scanner.nextInt();
            System.out.println("Nhập cạnh thứ ba");
            int c = scanner.nextInt();
            try {
                check.checkTriangleEdges(a, b, c);
            } catch (TriangleEgdesException e) {
                System.out.println(e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Bạn đã nhập sai");
        }
    }
}

