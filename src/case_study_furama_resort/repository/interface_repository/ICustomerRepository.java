package case_study_furama_resort.repository.interface_repository;

import case_study_furama_resort.model.person.Customer;

import java.util.LinkedList;
import java.util.List;

public interface ICustomerRepository extends IGeneralRepository {
    void editCustomer(int index, Customer customer);
    List<Customer> displayCustomer();
    void addNewCustomer(Customer customer);
    int searchIdCustomer(String id);
}
