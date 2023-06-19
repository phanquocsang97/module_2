package mvc_student.repo;

import mvc_student.model.Student;

import java.util.ArrayList;

import static mvc_student.view.Main.scanner;

public class StudentRepo implements IStudentRepo{
    static ArrayList<Student> studentArrayList = new ArrayList<>();
    static {
        studentArrayList.add(new Student(1,"sang",true,"1/1/1","co4",9));
        studentArrayList.add(new Student(2,"hai",true,"1/1/1","co4",9));
        studentArrayList.add(new Student(3,"thien",true,"1/1/1","co4",9));
    }

    @Override
    public void display() {
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.println(studentArrayList.get(i));
        }

    }

    @Override
    public void add(Student student) {
        studentArrayList.add(student);


    }

    @Override
    public void remove(int index) {
        String result;
        System.out.println(studentArrayList.get(index));
        System.out.println("Nhập yes để xóa");
        result = scanner.nextLine().toLowerCase();
        if (result.equals("yes")){
            studentArrayList.remove(index);
        }else {
            System.out.println("cancel");
        }
    }
    public int searchId(int id){
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (id == studentArrayList.get(i).getId()){
                return i;
            }
        }
        return -1;
    }
}
