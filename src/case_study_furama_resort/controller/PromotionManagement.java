package case_study_furama_resort.controller;


import java.util.Scanner;

import static mvc.mvc_student.view.Main.scanner;

public class PromotionManagement {
    Scanner scanner = new Scanner(System.in);

    public void selectPromotion() {
        boolean flag = true;
        do {
            System.out.println("-----PROMOTION MANAGEMENT-----\n" +
                    "1. Display list Promotion\n" +
                    "2. Add new Promotion\n" +
                    "3. Return main menu\n" +
                    "Enter your choice here : ");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Display list customers use service");
                        break;
                    case 2:
                        System.out.println("Display list customers get voucher");
                        break;
                    case 3:
                        System.out.println("Return Main Menu");
                        flag = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        } while (flag);
    }
}
