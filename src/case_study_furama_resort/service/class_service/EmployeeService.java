package case_study_furama_resort.service.class_service;

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
        System.out.println("Enter Id want to edit : ");
        String id = scanner.nextLine();
        int index = employeeRepository.searchId(id);
        if (index == -1) {
            System.out.println("Id not exist");
        } else {
            System.out.println("Enter name employee :");
            String nameEmployee = scanner.nextLine();
            System.out.println("Enter date employee : ");
            String dateEmployee = scanner.nextLine();
            System.out.println("Enter gender employee : ");
            boolean genderEmployee = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Enter identity number employee : ");
            String identityNumberEmployee = scanner.nextLine();
            System.out.println("Enter phone number employee : ");
            String phoneNumberEmployee = scanner.nextLine();
            System.out.println("Enter email employee : ");
            String emailEmployee = scanner.nextLine();
            System.out.println("Enter level employee : ");
            String levelEmployee = scanner.nextLine();
            System.out.println("Enter position employee : ");
            String positionEmployee = scanner.nextLine();
            System.out.println("Enter salary employee : ");
            String salaryEmployee = scanner.nextLine();
            Employee employee = new Employee(id, nameEmployee, dateEmployee, genderEmployee, identityNumberEmployee, phoneNumberEmployee, emailEmployee, levelEmployee, positionEmployee, salaryEmployee);
            System.out.println(employee);
            employeeRepository.editEmployee(index, employee);
        }
    }

    @Override
    public void addNewEmployee() {

//        String name, String date, boolean gender, int identityNumber, int phoneNumber, String email,
//        String idEmployee, String levelEmployee, String positionEmployee, int salaryEmployee
        System.out.println("Enter id employee : ");
        String idEmployee = scanner.nextLine();
        System.out.println("Enter name employee : ");
        String nameEmployee = scanner.nextLine();
        System.out.println("Enter date employee : ");
        String dateEmployee = scanner.nextLine();
        System.out.println("Enter gender employee : ");
        boolean genderEmployee = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Enter identity number employee : ");
        String identityNumberEmployee = scanner.nextLine();
        System.out.println("Enter phone number employee : ");
        String phoneNumberEmployee = scanner.nextLine();
        System.out.println("Enter email employee : ");
        String emailEmployee = scanner.nextLine();
        System.out.println("Enter level employee : ");
        String levelEmployee = scanner.nextLine();
        System.out.println("Enter position employee : ");
        String positionEmployee = scanner.nextLine();
        System.out.println("Enter salary employee : ");
        String salaryEmployee = scanner.nextLine();
        Employee employee1 = new Employee(idEmployee, nameEmployee, dateEmployee, genderEmployee, identityNumberEmployee, phoneNumberEmployee, emailEmployee, levelEmployee, positionEmployee, salaryEmployee);
        employeeRepository.addNewEmployee(employee1);
        System.out.println("Add success");
    }

    @Override
    public void displayListEmployee() {
        List<Employee> employeeList = employeeRepository.displayListEmployee();
        for (Employee e : employeeList) {
            System.out.println(e);
        }
    }
}
