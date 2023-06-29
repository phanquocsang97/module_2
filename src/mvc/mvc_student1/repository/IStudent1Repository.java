package mvc.mvc_student1.repository;

import mvc.mvc_student1.model.Student1Model;

import java.util.List;

public interface IStudent1Repository {
    List<Student1Model> displayStudent1();
    void addStudent1(Student1Model student1);
    void searchInfoStudent1(int id);
}
