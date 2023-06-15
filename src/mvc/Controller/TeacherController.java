package mvc.Controller;

import mvc.Service.TeacherService;

import java.util.Scanner;

public class TeacherController {
    private static TeacherService teacherService = new TeacherService();

    public static void showMenu() {
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
                    System.out.println("Chức năng hiển thị");
                    teacherService.display();
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    teacherService.add();
                case 3:
                    System.out.println("Xóa");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
