package algorithm_exam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        int height = 6;
        for (int i = 1; i < height; i++) {
            for (int j = 1; j < (height * 2); j++) {
                if (j == height - i || j == height + i){
                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j < (height * 2); j++) {
                if (j - i == 6 || j + i == 6){
                    System.out.print(i);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
