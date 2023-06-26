package ss17_binary_file.exercise.exercise1.view;

import ss17_binary_file.exercise.exercise1.controller.ProductController;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showMenuProduct();
    }
}
