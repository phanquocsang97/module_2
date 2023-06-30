package case_study_furama_resort.controller;


import java.util.Scanner;

import static mvc.mvc_student.view.Main.scanner;

public class PromotionManagement {
    Scanner scanner = new Scanner(System.in);

    public void selectPromotion() {
        boolean flag = true;
        do {
            System.out.println("-----QUẢN LÍ CÁC ƯU ĐÃI-----\n" +
                    "1. Hiển thị danh sách ưu đãi\n" +
                    "2. Thêm mới các ưu đãi\n" +
                    "3. Quay lại menu chính\n" +
                    "Nhập lựa chọn của bạn : ");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Hiển thị danh sách khách hàng sử dụng dịch vụ");
                        break;
                    case 2:
                        System.out.println("Hiển thị danh sách có khuyến mãi");
                        break;
                    case 3:
                        System.out.println("Quay lại menu chính");
                        flag = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        } while (flag);
    }
}
