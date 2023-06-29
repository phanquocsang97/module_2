package case_study_furama_resort.repository.interface_repository;

import case_study_furama_resort.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository extends IGeneralRepository{
    void editEmployee(int index, Employee employee);
    void addNewEmployee(Employee employee);
    List<Employee> displayListEmployee();
     int searchId(String id);
}
