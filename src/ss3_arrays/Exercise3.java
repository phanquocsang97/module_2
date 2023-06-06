package ss3_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arrNew = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arrNew[i] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arrNew[i + 5] = arr2[i];
        }
        System.out.println(Arrays.toString(arrNew));
    }
}
