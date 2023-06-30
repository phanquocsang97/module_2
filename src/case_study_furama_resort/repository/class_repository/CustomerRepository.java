package case_study_furama_resort.repository.class_repository;

import case_study_furama_resort.model.person.Customer;
import case_study_furama_resort.repository.interface_repository.ICustomerRepository;
import case_study_furama_resort.utils.WriteAndRead;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    Customer customer = new Customer();
    private final String CUSTOMER_PATH_FILE = "D:\\CodeGym\\Module 2\\src\\case_study_furama_resort\\data\\customer.csv";

    @Override
    public void editCustomer(int index, Customer customer) {
        List<String> stringList = WriteAndRead.readFile(CUSTOMER_PATH_FILE);
        stringList.set(index, customer.converToStringCustomer());
        WriteAndRead.writeFileByList(CUSTOMER_PATH_FILE, stringList, false);

    }

    @Override
    public List<Customer> displayCustomer() {
        List<Customer> customerList = new ArrayList<>();
        List<String> stringList = WriteAndRead.readFile(CUSTOMER_PATH_FILE);
        String[] info = null;
        for (String s : stringList) {
            info = s.split(",");
            customer = new Customer(info[0], info[1], info[2], Boolean.parseBoolean(info[3]), info[4], info[5], info[6], info[7], info[8]);
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public void addNewCustomer(Customer customer) {
        WriteAndRead.writeFile(CUSTOMER_PATH_FILE, customer.converToStringCustomer(), true);
    }

    public int searchIdCustomer(String id) {
        List<Customer> list = displayCustomer();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getIdCustomer())) {
                index = i;
            }
        }
        return index;
    }
}
