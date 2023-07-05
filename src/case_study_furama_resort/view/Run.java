package case_study_furama_resort.view;

import case_study_furama_resort.controller.FuramaController;

import java.util.Scanner;

public class Run {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        FuramaController furamaController = new FuramaController();
        furamaController.displayMainMenu();
    }
}
