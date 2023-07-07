package mvc.mvc_product.product_view;

import mvc.mvc_product.product_controller.ProductController;

import java.util.Scanner;

public class Run {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       ProductController productController = new ProductController();
       productController.displayMenu();
    }
}
