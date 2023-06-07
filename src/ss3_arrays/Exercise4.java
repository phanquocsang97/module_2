package ss3_arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
//        int[]arr1 = {1,2,3};
//        int[]arr2 = {4,5,6};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng");
        int m = scanner.nextInt();
        int[][] arr = new int[m][];
        for (int i = 0; i < m; i++) {
            System.out.printf("Nhập chiều dài của mảng %d", i);
            int n = scanner.nextInt();
            arr[i] = new int[n];
            for (int j = 0; j < n; j++) {
                System.out.println("Nhập phàn tử thứ arr[" + i + "][" + j + "]");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Số lớn nhất là " + max);
    }
}
