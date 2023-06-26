package ss17_binary_file.exercise.exercise1.controller;

import ss17_binary_file.exercise.exercise1.service.ProductService;

import static ss17_binary_file.exercise.exercise1.view.Main.scanner;

public class ProductController {
    ProductService productService = new ProductService();

    public void showMenuProduct() {
        do {
            System.out.println("-----PRODUCT MANAGEMENT-----\n" +
                    "1. Add product\n" +
                    "2. Display product\n" +
                    "3. Search product\n" +
                    "4. Exit\n" +
                    "Enter your choice here : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Add Information Product");
                    productService.addProduct();
                    break;
                case 2:
                    System.out.println("Display Product");
                    productService.displayList();
                    break;
                case 3:
                    System.out.println("Search Product");
                    productService.searchProduct();
                    break;
                case 4:
                    System.out.println("Exit Program");
                    System.exit(0);
            }
        } while (true);
    }
}
