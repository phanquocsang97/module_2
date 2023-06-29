package mvc.mvc_teacher.repository;

import mvc.mvc_teacher.model.Teacher;

import java.util.ArrayList;

public interface ITeacherRepository {
    ArrayList<Teacher> display();

    void add(Teacher teacher);

    void delete(int id);
}
