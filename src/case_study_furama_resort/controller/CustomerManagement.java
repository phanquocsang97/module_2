package case_study_furama_resort.controller;


import case_study_furama_resort.service.class_service.CustomerService;
import case_study_furama_resort.service.interface_service.ICustomerService;

import java.util.Scanner;

public class CustomerManagement {
    Scanner scanner = new Scanner(System.in);

    public void selectCustomer() {
        ICustomerService customerService = new CustomerService();
        boolean flag = true;
        do {
            System.out.println("-----QUẢN LÍ KHÁCH HÀNG-----\n" +
                    "1. Hiển thị danh sách khách hàng\n" +
                    "2. Thêm mới khách hàng\n" +
                    "3. Chỉnh sửa khách hàng\n" +
                    "4. Quay lại menu chính\n" +
                    "Nhập lựa chọn của bạn : ");
            try {
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Hiển thị danh sách khách hàng");
                        customerService.displayListCustomer();
                        break;
                    case 2:
                        System.out.println("Thêm mới khách hàng");
                        customerService.addNewCustomer();
                        break;
                    case 3:
                        System.out.println("Chỉnh sửa khách hàng");
                        customerService.editCustomer();
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
