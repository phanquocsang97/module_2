package mvc.mvc_teacher.view;

import mvc.mvc_teacher.controller.TeacherController;

public class View {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.showMenu();
    }
}

