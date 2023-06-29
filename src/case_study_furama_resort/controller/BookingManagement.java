package case_study_furama_resort.controller;

import java.util.Scanner;


public class BookingManagement {
    public void selectBooking() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("-----BOOKING MANAGEMENT-----\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n" +
                    "Enter your choice here : ");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Add New Booking");
                        break;
                    case 2:
                        System.out.println("Display list booking");
                        break;
                    case 3:
                        System.out.println("Create new contracts");
                        break;
                    case 4:
                        System.out.println("Display list contracts");
                        break;
                    case 5:
                        System.out.println("Edit contracts");
                        break;
                    case 6:
                        System.out.println("Return main menu");
                        flag = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        } while (flag);
    }
}
