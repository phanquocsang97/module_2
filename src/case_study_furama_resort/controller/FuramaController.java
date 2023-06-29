package case_study_furama_resort.controller;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        do {
            System.out.println("-----WORK MANAGEMENT-----\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n" +
                    "Enter your choice here : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    EmployeeManagement employeeManagement = new EmployeeManagement();
                    employeeManagement.selectEmployee();
                    break;
                case 2:
                    CustomerManagement customerManagement = new CustomerManagement();
                    customerManagement.selectCustomer();
                    break;
                case 3:
                    FacilityManagement facilityManagement = new FacilityManagement();
                    facilityManagement.selectFacility();
                    break;
                case 4:
                    BookingManagement bookingManagement = new BookingManagement();
                    bookingManagement.selectBooking();
                    break;
                case 5:
                    PromotionManagement promotionManagement = new PromotionManagement();
                    promotionManagement.selectPromotion();
                    break;
                case 6:
                    System.out.println("-----EXIT PROGRAM-----");
                    System.exit(0);
            }
        } while (true);
    }
}
