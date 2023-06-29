package mvc.mvc_student1.model;

public class Student1Model {
    private int idStudent;
    private String nameStudent;
    private String dateStudent;
    private boolean genderStudent;
    private String classNameStudent;

    public Student1Model() {
    }

    public Student1Model(int idStudent, String nameStudent, String dateStudent, boolean genderStudent, String classNameStudent) {
        this.idStudent = idStudent;
        this.nameStudent = nameStudent;
        this.dateStudent = dateStudent;
        this.genderStudent = genderStudent;
        this.classNameStudent = classNameStudent;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getDateStudent() {
        return dateStudent;
    }

    public void setDateStudent(String dateStudent) {
        this.dateStudent = dateStudent;
    }

    public boolean isGenderStudent() {
        return genderStudent;
    }

    public void setGenderStudent(boolean genderStudent) {
        this.genderStudent = genderStudent;
    }

    public String getClassNameStudent() {
        return classNameStudent;
    }

    public void setClassNameStudent(String classNameStudent) {
        this.classNameStudent = classNameStudent;
    }

    @Override
    public String toString() {
        return "Student1Model{" +
                "idStudent=" + idStudent +
                ", nameStudent='" + nameStudent + '\'' +
                ", dateStudent='" + dateStudent + '\'' +
                ", genderStudent=" + genderStudent +
                ", classNameStudent='" + classNameStudent + '\'' +
                '}';
    }
}
