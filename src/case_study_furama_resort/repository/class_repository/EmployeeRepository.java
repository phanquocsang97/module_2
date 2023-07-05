package case_study_furama_resort.repository.class_repository;

import case_study_furama_resort.model.person.Employee;
import case_study_furama_resort.repository.interface_repository.IEmployeeRepository;
import case_study_furama_resort.utils.WriteAndRead;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final String EMPLOYEE_PATH_FILE = "D:\\CodeGym\\Module 2\\src\\case_study_furama_resort\\data\\employee.csv";


    @Override
    public void editEmployee(int index, Employee employee) {
        List<String> stringList = WriteAndRead.readFile(EMPLOYEE_PATH_FILE);

        stringList.set(index, employee.converToStringList());
        WriteAndRead.writeFileByList(EMPLOYEE_PATH_FILE,stringList,false);
    }

    @Override
    public void addNewEmployee(Employee employee) {
        WriteAndRead.writeFile(EMPLOYEE_PATH_FILE,employee.converToStringList(),true);
    }

    @Override
    public List<Employee> displayListEmployee() {
//        String idEmployee,String name, String date, boolean gender, String identityNumber, String phoneNumber, String email, String levelEmployee,
//        String positionEmployee, String salaryEmployee
        List<Employee> employeeList = new ArrayList<>();
        List<String> stringList = WriteAndRead.readFile(EMPLOYEE_PATH_FILE);
        String[] info = null;
        for (String s : stringList) {
            info = s.split(",");
         Employee employee = new Employee(info[0],info[1],info[2],Boolean.parseBoolean(info[3]),info[4],info[5],info[6],info[7],info[8],info[9]);
            employeeList.add(employee);
        }
        return employeeList;
    }
    public int searchIdEmployee(String id){
        List<Employee> list = displayListEmployee();
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getIdEmployee())){
                index = i;
            }
        }
        return index;
    }
}
