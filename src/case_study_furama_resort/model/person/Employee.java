package case_study_furama_resort.model.person;

public class Employee extends Person{

    private String idEmployee;
    private String levelEmployee;
    private String positionEmployee;
    private String salaryEmployee;

    public Employee() {
    }



    public Employee(String idEmployee,String name, String date, boolean gender, String identityNumber, String phoneNumber, String email, String levelEmployee, String positionEmployee, String salaryEmployee) {
        super(name, date, gender, identityNumber, phoneNumber, email);
        this.idEmployee = idEmployee;
        this.levelEmployee = levelEmployee;
        this.positionEmployee = positionEmployee;
        this.salaryEmployee = salaryEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getLevelEmployee() {
        return levelEmployee;
    }

    public void setLevelEmployee(String levelEmployee) {
        this.levelEmployee = levelEmployee;
    }

    public String getPositionEmployee() {
        return positionEmployee;
    }

    public void setPositionEmployee(String positionEmployee) {
        this.positionEmployee = positionEmployee;
    }

    public String getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(String salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

//    String idEmployee,String name, String date, boolean gender, int identityNumber, int phoneNumber,
//    String email, String levelEmployee, String positionEmployee, int salaryEmployee
    public String converToStringList(){
        return idEmployee + "," + name + "," + date + "," + gender + "," + identityNumber + "," + phoneNumber + "," + email
                + "," + levelEmployee + "," + positionEmployee + "," + salaryEmployee;
    }
    @Override
    public String toString() {
        String sexEmployee;
        if (gender){
            sexEmployee = "man";
        }else {
            sexEmployee = "lady";
        }
        return "Employee{" +
                "idEmployee='" + idEmployee + '\'' +
                ", nameEmployee ='" + name + '\'' +
                ", dateEmployee ='" + date + '\'' +
                ", genderEmployee ='" + sexEmployee + '\'' +
                ", identityEmployee ='" + identityNumber + '\'' +
                ", phoneNumberEmployee ='" + phoneNumber + '\'' +
                ", emailEmployee =" + email +
                ", levelEmployee =" + levelEmployee +
                ", positionEmployee =" + positionEmployee +
                ", salaryEmployee ='" + salaryEmployee + '\'' +
                '}';
    }

}
