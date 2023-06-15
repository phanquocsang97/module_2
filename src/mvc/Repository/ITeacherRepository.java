package mvc.Repository;

import mvc.Model.Teacher;

import java.util.ArrayList;

public interface ITeacherRepository {
    ArrayList<Teacher> display();
    void add(Teacher teacher);
    void delete();
}
