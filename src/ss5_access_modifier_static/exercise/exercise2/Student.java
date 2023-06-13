package ss5_access_modifier_static.exercise.exercise2;

public class Student {

    private String name;
    private String classes;

    public Student() {
    }

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {

        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", classes='" + classes + '\'' + '}';
    }

    public static void main(String[] args) {
        Student student = new Student("Sang","c04");
        Student student1 = new Student("sang", "co4");
        student.setName("Sang");
        student.setClasses("C0423G1");
        System.out.println(student);
        System.out.println(student1);

    }
}
