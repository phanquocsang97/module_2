package mvc_student.controller;

import mvc_student.service.StudentService;

import java.util.Scanner;

public class Controller {
    StudentService studentService = new StudentService();
    public void showMenu(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :" +
                    "\n1. Display" +
                    "\n2. Add" +
                    "\n3.Delete" +
                    "\n4.Edit" +
                    "\n5.Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Hiển thị danh sách");
                    studentService.display();
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    studentService.add();
                    break;
                case 3:
                    System.out.println("Xóa");
                    studentService.remove();
                    break;
                case 4:
                    System.exit(0);
                default:
                    flag = false;
            }
        } while (flag);
    }


}
