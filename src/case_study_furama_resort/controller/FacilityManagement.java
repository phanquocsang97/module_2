package case_study_furama_resort.controller;

import java.util.Scanner;

public class FacilityManagement {
    Scanner scanner = new Scanner(System.in);

    public void selectFacility() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("-----FACILITY MANAGEMENT-----\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n" +
                    "Enter your choice here : ");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Display List Facility");
                        break;
                    case 2:
                        System.out.println("Add New Facility");
                        break;
                    case 3:
                        System.out.println("Display list facility maintenance");
                        break;
                    case 4:
                        System.out.println("Return Main Menu");
                        flag = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        } while (flag);
    }
}
