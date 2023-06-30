package case_study_furama_resort.service.class_service;

import case_study_furama_resort.common.Validate;
import case_study_furama_resort.model.person.Employee;
import case_study_furama_resort.repository.class_repository.EmployeeRepository;
import case_study_furama_resort.repository.interface_repository.IEmployeeRepository;
import case_study_furama_resort.service.interface_service.IEmployeeService;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    Scanner scanner = new Scanner(System.in);
    private static IEmployeeRepository employeeRepository = new EmployeeRepository();


    @Override
    public void editEmployee() {
        System.out.println("Nhập id bạn muốn chỉnh sửa : ");
        String id = Validate.validateIdEmployee();
        int index = employeeRepository.searchIdEmployee(id);
        if (index == -1) {
            System.out.println("Id không tồn tại");
        } else {
            System.out.println("Nhập tên nhân viên :");
            String nameEmployee = Validate.validateName();
            System.out.println("Nhập ngày sinh nhân viên : ");
            String dateEmployee = scanner.nextLine();
            System.out.println("Nhập giới tính nhân viên : ");
            boolean genderEmployee = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Nhập CMND nhân viên : ");
            String identityNumberEmployee = Validate.validateIdentityNumber();
            System.out.println("Nhập SĐT nhân viên : ");
            String phoneNumberEmployee = Validate.validatePhoneNumber();
            System.out.println("Nhập email nhân viên : ");
            String emailEmployee = scanner.nextLine();
            System.out.println("Nhập trình độ nhân viên : ");
            String levelEmployee = scanner.nextLine();
            System.out.println("Nhập vị trí nhân viên : ");
            String positionEmployee = scanner.nextLine();
            System.out.println("Nhập lương của nhân viên : ");
            String salaryEmployee = Validate.validateSalary();
            Employee employee = new Employee(id, nameEmployee, dateEmployee, genderEmployee, identityNumberEmployee, phoneNumberEmployee, emailEmployee, levelEmployee, positionEmployee, salaryEmployee);
            System.out.println(employee);
            employeeRepository.editEmployee(index, employee);
        }
    }

    @Override
    public void addNewEmployee() {
//        String name, String date, boolean gender, int identityNumber, int phoneNumber, String email,
//        String idEmployee, String levelEmployee, String positionEmployee, int salaryEmployee
        System.out.println("Nhập id của nhân viên : ");
        String idEmployee = Validate.validateIdEmployee();
        System.out.println("Nhập tên của nhân viên : ");
        String nameEmployee = Validate.validateName();
        System.out.println("Nhập ngày sinh của nhân viên : ");
        String dateEmployee = scanner.nextLine();
        System.out.println("Nhập giới tính của nhân viên : ");
        boolean genderEmployee = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập CMND của nhân viên : ");
        String identityNumberEmployee = Validate.validateIdentityNumber();
        System.out.println("Nhập SĐT của nhân viên : ");
        String phoneNumberEmployee = Validate.validatePhoneNumber();
        System.out.println("Nhập email của nhân viên : ");
        String emailEmployee = scanner.nextLine();
        System.out.println("Nhập trình độ của nhân viên : ");
        String levelEmployee = scanner.nextLine();
        System.out.println("Nhập vị trí của nhân viên : ");
        String positionEmployee = scanner.nextLine();
        System.out.println("Nhập lương của nhân viên : ");
        String salaryEmployee = Validate.validateSalary();
        Employee employee = new Employee(idEmployee, nameEmployee, dateEmployee, genderEmployee, identityNumberEmployee, phoneNumberEmployee, emailEmployee, levelEmployee, positionEmployee, salaryEmployee);
        employeeRepository.addNewEmployee(employee);
    }

    @Override
    public void displayListEmployee() {
        List<Employee> employeeList = employeeRepository.displayListEmployee();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
