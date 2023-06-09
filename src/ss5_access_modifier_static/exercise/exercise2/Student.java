package ss5_access_modifier_static.exercise.exercise2;

public class Student {
    private String name;
    private String classes;

    public Student() {
        name = "Phan Quoc Sang";
        classes = "C0423G1";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {

        this.classes = classes;
    }

    public String getName() {

        return name;
    }

    public String getClasses() {

        return classes;
    }

    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Sang");
        student.setClasses("C0423G1");

        String name = student.getName();
        String classes = student.getClasses();

        System.out.println("Name : " + name);
        System.out.println("Classes : " + classes);
    }
}
