package case_study_furama_resort.repository.interface_repository;

public interface ICustomerRepository extends IGeneralRepository {
    void editCustomer();
    void displayListCustomer();
    void addNewCustomer();
}
