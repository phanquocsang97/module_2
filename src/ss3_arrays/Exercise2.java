package ss3_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrNum = {10, 4, 6, 7, 8};
        int[] arrNewNum;
        arrNewNum = new int[arrNum.length + 1];
        System.out.println("Nhập số muốn chèn");
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí muốn chèn");
        int index = scanner.nextInt();
        for (int i = 0; i < arrNewNum.length; i++) {
            if (i < index) {
                arrNewNum[i] = arrNum[i];
            } else if (i == index) {
                arrNewNum[i] = number;
            } else {
                arrNewNum[i] = arrNum[i - 1];
            }
        }
        System.out.println(Arrays.toString(arrNewNum));
    }
}
