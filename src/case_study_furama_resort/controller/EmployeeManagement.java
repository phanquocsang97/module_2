package case_study_furama_resort.controller;

import case_study_furama_resort.model.person.Employee;
import case_study_furama_resort.service.class_service.EmployeeService;
import case_study_furama_resort.service.interface_service.IEmployeeService;

import java.util.Scanner;


public class EmployeeManagement {
    Scanner scanner = new Scanner(System.in);

    public void selectEmployee() {
        IEmployeeService employeeService = new EmployeeService();
        boolean flag = true;
        do {
            System.out.println("-----QUẢN LÍ NHÂN VIÊN-----\n" +
                    "1. Hiển thị danh sách nhân viên\n" +
                    "2. Thêm mới nhân viên\n" +
                    "3. Chỉnh sửa nhân viên\n" +
                    "4. Quay lại menu chính\n" +
                    "Nhập lựa chọn của bạn : ");

            try {
                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("Hiển thị danh sách nhân viên");
                        employeeService.displayListEmployee();
                        break;
                    case 2:
                        System.out.println("Thêm mới nhân viên");
                        employeeService.addNewEmployee();
                        break;
                    case 3:
                        System.out.println("Chỉnh sửa nhân viên");
                        employeeService.editEmployee();
                        break;
                    case 4:
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
