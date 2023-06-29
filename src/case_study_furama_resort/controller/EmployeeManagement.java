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
            System.out.println("-----EMPLOYEES MANAGEMENT-----\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n" +
                    "Enter your choice here : ");

            try {
                int choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("Display List Employees");
                        employeeService.displayListEmployee();
                        break;
                    case 2:
                        System.out.println("Add New Employees");
                        employeeService.addNewEmployee();
                        break;
                    case 3:
                        System.out.println("Edit Employees");
                        employeeService.editEmployee();
                        break;
                    case 4:
                        System.out.println("Return Main Menu");
                        flag = false;
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Try again");
            }
        } while (flag);
    }
}
