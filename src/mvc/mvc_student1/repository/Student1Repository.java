package mvc.mvc_student1.repository;

import mvc.mvc_student1.model.Student1Model;
import mvc.mvc_student1.util.WriteAndRead;

import java.util.ArrayList;
import java.util.List;

public class Student1Repository implements IStudent1Repository{
    private final String STUDENT_PATH_FILE ="D:\\CodeGym\\Module 2\\src\\mvc\\mvc_student1\\data\\list_student.csv";

    @Override
    public List<Student1Model> displayStudent1() {
        List<Student1Model> student1ModelList = new ArrayList<>();
        List<String> stringList = WriteAndRead.readFile(STUDENT_PATH_FILE);
        String[] info = null;
        for (String s : stringList) {
            info = s.split(",");
            Student1Model student1Model = new Student1Model(Integer.parseInt(info[0]), info[1], info[2], Boolean.parseBoolean(info[3]), info[4]);
            student1ModelList.add(student1Model);
        }
        return student1ModelList;
    }

    @Override
    public void addStudent1(Student1Model student1) {

    }

    @Override
    public void searchInfoStudent1(int id) {

    }
}
