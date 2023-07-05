package case_study_furama_resort.controller;

import case_study_furama_resort.service.class_service.facility.FacilityService;
import case_study_furama_resort.service.interface_service.IFacilityService;

import java.util.Scanner;

public class FacilityManagement {
    public void selectFacility() {
        Scanner scanner = new Scanner(System.in);
        IFacilityService facilityService = new FacilityService();
        boolean flag = true;
        do {
            System.out.println("-----QUẢN LÍ CƠ SỞ VẬT CHẤT-----\n" +
                    "1. Hiển thị danh sách sơ sở\n" +
                    "2. Thêm mới cơ sở\n" +
                    "3. Hiển thị danh sách bảo trì cơ sở\n" +
                    "4. Quay lại menu chính\n" +
                    "Nhập lựa chọn của bạn : ");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Hiển thị danh sách cơ sở");
                        facilityService.displayListFacility();
                        break;
                    case 2:
                        System.out.println("Thêm mới cơ sở");
                        facilityService.addNewFacility();
                        break;
                    case 3:
                        System.out.println("Hiển thị danh sách bảo trì cơ sở");
                        break;
                    case 4:
                        System.out.println("Quay lại menu chính");
                        flag = false;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập lại");
            }
        } while (flag);
    }
}
