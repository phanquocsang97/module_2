package case_study_furama_resort.service.interface_service;

import case_study_furama_resort.model.person.Employee;

import java.util.List;

public interface IEmployeeService extends IGeneralService{
    void editEmployee();
    void addNewEmployee();
    void displayListEmployee();
}
