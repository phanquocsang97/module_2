package mvc.controller;

import mvc.service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private final TeacherService teacherService = new TeacherService();

    public void showMenu() {
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
                    teacherService.display();
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    teacherService.add();
                    break;
                case 3:
                    System.out.println("Xóa");
                    teacherService.delete();
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
