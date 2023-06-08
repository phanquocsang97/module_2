package ss3_arrays;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chiều dài của mảng");
        int m = scanner.nextInt();
        int[][] array = new int[m][];
        for (int i = 0; i < m; i++) {
            System.out.println("Nhập chiều dài mảng thứ " + i);
            int n = scanner.nextInt();
            array[i] = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phần thứ arr[" + i + "][" + j + "]");
                array[i][j] = scanner.nextInt();
            }
        }
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += array[i][i];
        }
        System.out.println("Tổng là : " + sum);
    }
}
