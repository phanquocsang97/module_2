package mvc.repository;

import mvc.model.Teacher;

import java.util.ArrayList;

public class TeacherRepository implements ITeacherRepository {

    static ArrayList<Teacher> teacherArraysList = new ArrayList<>();

    static {
        teacherArraysList.add(new Teacher(1, "Sang", true, "Math"));
        teacherArraysList.add(new Teacher(2, "Thiện", true, "Physics"));
        teacherArraysList.add(new Teacher(3, "Hải", true, "Chemistry"));
    }

    @Override
    public ArrayList<Teacher> display() {
        return teacherArraysList;
    }

    @Override
    public void add(Teacher teacher) {
        teacherArraysList.add(teacher);

    }

    @Override
    public void delete() {
    }
}
