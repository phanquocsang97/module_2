package mvc.Service;

import mvc.Model.Teacher;
import mvc.Repository.TeacherRepository;

import java.util.ArrayList;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private final TeacherRepository teacherRepository = new TeacherRepository();

    @Override
    public void display() {
        ArrayList<Teacher> teachers = teacherRepository.display();
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }

    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập giới tính");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập môn học");
        String major = scanner.nextLine();
        Teacher teacher = new Teacher(id,name,gender,major);
        teacherRepository.add(teacher);

    }

    @Override
    public void delete() {

    }
}
