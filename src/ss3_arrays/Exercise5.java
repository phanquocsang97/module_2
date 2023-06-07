package ss3_arrays;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập số phần tử của mảng");
//        int m = scanner.nextInt();
//        System.out.println("Nhập chiều dài của mảng");
//        int n = scanner.nextInt();
//        int[][] arr = new int[m][];
//        for (int i = 0; i < m; i++) {
//            arr[i] = new int[n];
//            for (int j = 0; j < n; j++) {
//                System.out.println("Nhập vào phần tử thứ arr[" + i + "][" + j + "]");
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        int min = arr[0][0];
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (min > arr[i][j]) {
//                    min = arr[i][j];
//                }
//            }
//        }
//        System.out.println("Số nhỏ nhất là " + min);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng các số trong mảng");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Nhập các số " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("Số nhỏ nhất là : " + min);
    }
}
