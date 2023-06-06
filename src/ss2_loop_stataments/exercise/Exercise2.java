package ss2_loop_stataments.exercise;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        int countPrime = 0;
        int numberCheck = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bạn muốn bao nhiêu số nguyên tố?");
        int number = scanner.nextInt();
        do {
            int count = 0;
            for (int i = 1; i <= numberCheck; i++) {
                if (numberCheck % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(numberCheck + "\n");
                countPrime++;
            }
            numberCheck++;
        } while (countPrime < 20);
    }
}
