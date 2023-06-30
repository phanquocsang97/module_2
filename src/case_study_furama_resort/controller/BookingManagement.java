package case_study_furama_resort.controller;

import java.util.Scanner;


public class BookingManagement {
    public void selectBooking() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("-----QUẢN LÍ BOOKING-----\n" +
                    "1. Thêm mới booking\n" +
                    "2. Hiển thị danh sách booking\n" +
                    "3. Tạo hợp đồng mới\n" +
                    "4. Hiển thị danh sách hợp đồng\n" +
                    "5. Chỉnh sửa hợp đồng\n" +
                    "6. Quay lại menu chính\n" +
                    "Nhập lựa chọn của bạn : ");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Thêm mới Booking");
                        break;
                    case 2:
                        System.out.println("Hiển thị danh sách booking");
                        break;
                    case 3:
                        System.out.println("Tạo hợp đồng mới");
                        break;
                    case 4:
                        System.out.println("Hiên thị danh sách hợp đồng");
                        break;
                    case 5:
                        System.out.println("Chỉnh sửa hợp đồng");
                        break;
                    case 6:
                        System.out.println("Quay lại menu chính");
                        flag = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (flag);
    }
}
