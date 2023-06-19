package mvc_teacher.model;

public class Teacher {
    private int id;
    private String name;
    private boolean gender;
    private String major;

    public Teacher() {
    }

    public Teacher(int id, String name, boolean gender, String major) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.major = major;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", major='" + major + '\'' +
                '}';
    }
}
