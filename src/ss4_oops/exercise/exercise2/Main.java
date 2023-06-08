package ss4_oops.exercise.exercise2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StopWatch time = new StopWatch();
        boolean flag = true;
        do {
            System.out.println("Menu" + "\n1. Start" + "\n2. End");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    time.start();
                    System.out.println(time.startTime);
                    break;
                case 2:
                    time.stop();
                    System.out.println(time.endTime);
                    System.out.println(time.getElapsedTime());
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
