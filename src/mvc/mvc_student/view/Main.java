package mvc.mvc_student.view;

import mvc.mvc_student.controller.Controller;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Controller controller = new Controller();
        controller.showMenu();
    }
}
