package ss3_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrNum = {10, 3, 4, 8, 9, 5};
        int[] arrNewNum;
        arrNewNum = new int[arrNum.length - 1];
        System.out.println("Nhập số bạn muốn xóa");
        int number = scanner.nextInt();
        int index = 0;
        for (int i = 0; i < arrNum.length; i++) {
            if (number != arrNum[i]) {
                arrNewNum[index] = arrNum[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(arrNewNum));
    }
}
