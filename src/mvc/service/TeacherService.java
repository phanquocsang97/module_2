package mvc.service;

import mvc.model.Teacher;
import mvc.repository.TeacherRepository;

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
        Teacher teacher = new Teacher(id, name, gender, major);
        teacherRepository.add(teacher);

    }

    @Override
    public void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id bạn muốn xóa");
        int id = Integer.parseInt(scanner.nextLine());
        teacherRepository.delete(id);
    }
}
