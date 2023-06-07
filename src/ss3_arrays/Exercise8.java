package ss3_arrays;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        String arr = "Welcome to Module 2";
        System.out.println("Nhập kí tự muốn đếm");
        Scanner scanner = new Scanner(System.in);
        char word = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < arr.length(); i++) {
            if (word == arr.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
