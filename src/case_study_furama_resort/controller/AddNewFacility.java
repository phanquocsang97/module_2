package case_study_furama_resort.controller;

import java.util.Scanner;

public class AddNewFacility {
    public void selectAddNewFacility() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("-----Các dịch vụ muốn thêm-----\n" +
                    "1. Thêm mới villa\n" +
                    "2. Thêm mới nhà\n" +
                    "3. Thêm mới phòng\n" +
                    "Nhập lựa chọn của bạn : ");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Thêm mới villa ");
                        break;
                    case 2:
                        System.out.println("Thêm mới nhà ");
                        break;
                    case 3:
                        System.out.println("Thêm mới phòng");
                        break;
                    case 4:
                        System.out.println("Quay lại menu chính");
                        flag = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại!!");
            }
        } while (flag);
    }
}
