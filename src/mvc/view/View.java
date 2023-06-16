package mvc.view;

import mvc.controller.TeacherController;
import mvc.model.Teacher;

import java.util.ArrayList;

public class View {
    public static void main(String[] args) {
        TeacherController teacherController = new TeacherController();
        teacherController.showMenu();
    }
}

