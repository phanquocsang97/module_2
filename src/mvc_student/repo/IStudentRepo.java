package mvc_student.repo;

import mvc_student.model.Student;

import java.util.ArrayList;

public interface IStudentRepo {
    void display();
    void add(Student student);

    void remove(int index);

}
