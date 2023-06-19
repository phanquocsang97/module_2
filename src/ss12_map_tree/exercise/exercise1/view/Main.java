package ss12_map_tree.exercise.exercise1.view;


import ss12_map_tree.exercise.exercise1.controller.ProductController;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProductController productController = new ProductController();
        productController.showProduct();
    }
}
