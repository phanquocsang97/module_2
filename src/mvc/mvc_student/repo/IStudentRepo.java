package mvc.mvc_student.repo;

import mvc.mvc_student.model.Student;

public interface IStudentRepo {
    void display();
    void add(Student student);

    void remove(int index);

}
