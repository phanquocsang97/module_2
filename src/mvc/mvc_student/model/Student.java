package mvc.mvc_student.model;

public class Student extends Person {
    protected String className;
    protected int point;

    public Student() {
    }

    public Student(String className, int point) {
        this.className = className;
        this.point = point;
    }

    public Student(int id, String name, boolean gender, String dateOfBirth, String className, int point) {
        super(id, name, gender, dateOfBirth);
        this.className = className;
        this.point = point;
    }

    @Override
    public String toString() {
        String sex;
        if (gender){
             sex = "nam";
        }else {
             sex = "nữ";
        }
        return "Student{" +
                "className='" + className + '\'' +
                ", point=" + point +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + sex +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }
}
