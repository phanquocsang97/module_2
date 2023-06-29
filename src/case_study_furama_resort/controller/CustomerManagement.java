package case_study_furama_resort.controller;


import java.util.Scanner;

public class CustomerManagement {
    Scanner scanner = new Scanner(System.in);

    public void selectCustomer() {
        boolean flag = true;
        do {
            System.out.println("-----CUSTOMER MANAGEMENT-----\n" +
                    "1. Display list customer\n" +
                    "2. Add new customer\n" +
                    "3. Edit customer\n" +
                    "4. Return main menu\n" +
                    "Enter your choice here : ");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Display List Customer");
                        break;
                    case 2:
                        System.out.println("Add New Customer");
                        break;
                    case 3:
                        System.out.println("Edit Customer");
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
