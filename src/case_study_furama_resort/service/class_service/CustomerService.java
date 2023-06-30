package case_study_furama_resort.service.class_service;

import case_study_furama_resort.common.Validate;
import case_study_furama_resort.model.person.Customer;
import case_study_furama_resort.repository.class_repository.CustomerRepository;
import case_study_furama_resort.repository.interface_repository.ICustomerRepository;
import case_study_furama_resort.service.interface_service.ICustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    Scanner scanner = new Scanner(System.in);
    private static ICustomerRepository customerRepository = new CustomerRepository();

    @Override
    public void editCustomer() {
        System.out.println("Nhập id của khách hàng muốn sửa đổi :");
        String idCustomer = Validate.validateIdCustomer();
        int index = customerRepository.searchIdCustomer(idCustomer);
        if (index == -1) {
            System.out.println("ID này không tồn tại");
        } else {
            System.out.println("Nhập tên của khách hàng :");
            String nameCustomer = Validate.validateName();
            System.out.println("Nhập ngày sinh của khách hàng : ");
            String dateCustomer = scanner.nextLine();
            System.out.println("Nhập giới tính của khách hàng : ");
            boolean genderCustomer = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Nhập CMND của khách hàng : ");
            String identityNumberCustomer = Validate.validateIdentityNumber();
            System.out.println("Nhập SĐT của khách hàng : ");
            String phoneNumberCustomer = Validate.validatePhoneNumber();
            System.out.println("Nhập email của khách hàng : ");
            String emailCustomer = scanner.nextLine();
            System.out.println("Nhập loại khách hàng : ");
            String kindOfCustomer = scanner.nextLine();
            System.out.println("Nhập địa chỉ của khách hàng : ");
            String addressCustomer = scanner.nextLine();
            Customer customer = new Customer(idCustomer, nameCustomer, dateCustomer, genderCustomer, identityNumberCustomer, phoneNumberCustomer, emailCustomer, kindOfCustomer, addressCustomer);
            customerRepository.editCustomer(index, customer);
        }
    }

    @Override
    public void displayListCustomer() {
        List<Customer> customerList = customerRepository.displayCustomer();
        for (Customer c : customerList) {
            System.out.println(c);
        }

    }

    @Override
    public void addNewCustomer() {
//        String idCustomer,String name, String date, boolean gender, String identityNumber, String phoneNumber
//        , String email, String kindOfCustomer, String addressCustomer
        System.out.println("Nhập id của khách hàng : ");
        String idCustomer = Validate.validateIdCustomer();
        System.out.println("Nhập tên của khách hàng :");
        String nameCustomer = Validate.validateName();
        System.out.println("Nhập ngày sinh của khách hàng : ");
        String dateCustomer = scanner.nextLine();
        System.out.println("Nhập giới tính của khách hàng : ");
        boolean genderCustomer = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập CMND của khách hàng : ");
        String identityNumberCustomer = Validate.validateIdentityNumber();
        System.out.println("Nhập SĐT của khách hàng : ");
        String phoneNumberCustomer = Validate.validatePhoneNumber();
        System.out.println("Nhập email của khách hàng : ");
        String emailCustomer = scanner.nextLine();
        System.out.println("Nhập loại khách hàng : ");
        String kindOfCustomer = scanner.nextLine();
        System.out.println("Nhập địa chỉ của khách hàng : ");
        String addressCustomer = scanner.nextLine();
        Customer customer = new Customer(idCustomer, nameCustomer, dateCustomer, genderCustomer, identityNumberCustomer, phoneNumberCustomer, emailCustomer, kindOfCustomer, addressCustomer);
        customerRepository.addNewCustomer(customer);
    }
}
