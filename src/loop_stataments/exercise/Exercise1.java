package loop_stataments.exercise;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        boolean flag = true;
        do {
            int choice = -1;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Print the rectangle");
                    System.out.println("Enter Length");
                    int length = scanner.nextInt();
                    System.out.println("Enter width");
                    int width = scanner.nextInt();
                    for (int i = 0; i <= width; i++) {
                        for (int j = 0; j <= length; j++) {
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    int choiceRectangle;
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Pick style triangle");
                    System.out.println("1. Bottom-left");
                    System.out.println("2. Top-left");
                    System.out.println("3. Top-Right");
                    System.out.println("4. Bottom-right");
                    choiceRectangle = scanner1.nextInt();
                    System.out.println("Enter height");
                    int height = scanner.nextInt();
                    switch (choiceRectangle) {
                        case 1:
                            for (int i = 0; i <= height; i++) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            for (int i = height; i > 0; i--) {
                                for (int j = 0; j < i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 3:
                            for (int i = 0; i <= height; i++) {
                                for (int j = 0; j < height; j++) {
                                    if (j >= i) {
                                        System.out.print("*");
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                                System.out.println();
                            }
                            break;
                        case 4:
                            for (int i = 0; i <= height; i++) {
                                for (int j = 0; j < height; j++) {
                                    if (i + j >= height) {
                                        System.out.print("*");
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                                System.out.println();
                            }
                    }
                case 3:
                    System.out.println("Enter height");
                    int h = scanner.nextInt();
                    for (int i = 0; i <= h; i++) {
                        for (int j = 0; j <= h * 2; j++) {
                            if (j - i <= h && i + j >= h) {
                                System.out.print("*");
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                case 4:
                    flag = false;
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        } while (flag);
    }
}

