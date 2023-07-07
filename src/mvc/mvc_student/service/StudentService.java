package mvc.mvc_student.service;

import mvc.mvc_student.model.Student;
import mvc.mvc_student.repo.StudentRepo;

import static mvc.mvc_student.view.Main.scanner;

public class StudentService implements IStudentService{
     StudentRepo studentRepo = new StudentRepo();


    @Override
    public void display() {
        studentRepo.display();
    }

    @Override
    public void add() {
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập giới tính");
        boolean gender = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Nhập ngày sinh");
        String dateOfBirth = scanner.nextLine();
        System.out.println("Nhập tên lớp");
        String className = scanner.nextLine();
        System.out.println("Nhập điểm");
        int point = Integer.parseInt(scanner.nextLine());
        Student student = new Student(id, name, gender, dateOfBirth, className, point);
        studentRepo.add(student);
    }

    @Override
    public void remove() {
        int index = searchId();

        if (index == -1){
            System.out.println("Không thấy id");

        }else {
            studentRepo.remove(index);
        }

    }
    public int searchId(){
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        return studentRepo.searchId(id);
    }

}
