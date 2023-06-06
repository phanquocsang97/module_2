package ss1_introduce_to_java.exercise;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số");
        number = scanner.nextInt();
        String[] str1 = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] str2 = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] str3 = {"zero", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety", "one hundred"};
        if (number < 10) {
            System.out.println(str1[number]);
        } else if (number < 20) {
            System.out.println(str2[number - 10]);
        } else if (number < 100) {
            System.out.println(str3[number / 10] + str1[number % 10]);
        } else if (number < 1000) {
//            System.out.println((str1[number / 100]) + "hundred" + );
            int a = number / 100;
            int b = number % 100;
            int c = b / 10;
            int d = b % 10;
            if (c == 0) {
                System.out.println(str1[a] + " hundred " + " and " + str1[d]);
            } else if (b < 20) {
                System.out.println(str1[a] + " hundred " + str2[b - 10]);
            } else if (d == 0) {
                System.out.println(str1[a] + " hundred " + str3[c]);
            } else {
                System.out.println(str1[a] + " hundred " + str3[c] + str1[d]);
            }
        }
    }
}

