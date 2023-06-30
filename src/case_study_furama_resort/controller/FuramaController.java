package case_study_furama_resort.controller;

import java.util.Scanner;

public class FuramaController {
    Scanner scanner = new Scanner(System.in);

    public void displayMainMenu() {
        do {
            System.out.println("-----QUẢN LÍ CÔNG VIỆC-----\n" +
                    "1. Quản lí nhân sự\n" +
                    "2. Quản lí khách hàng\n" +
                    "3. Quản lí cơ sở vật chất\n" +
                    "4. Quản lí đơn đặt hàng\n" +
                    "5. Quản lí các ưu đãi\n" +
                    "6. Thoát chương trình\n" +
                    "Nhập lựa chọn của bạn : ");
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
                    System.out.println("-----THOÁT CHƯƠNG TRÌNH-----");
                    System.exit(0);
            }
        } while (true);
    }
}
