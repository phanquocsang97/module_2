package ss12_map_tree.exercise.exercise1.controller;

import ss12_map_tree.exercise.exercise1.service.ProductService;

import java.util.Scanner;

public class ProductController {
    ProductService productService = new ProductService();

    public void showProduct() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng :" +
                    "\n1. Display" +
                    "\n2. Add" +
                    "\n3.Delete" +
                    "\n4.Edit" +
                    "\n5.Search" +
                    "\n6.Arrange" +
                    "\n7.Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Hiển thị danh sách");
                    productService.display();
                    break;
                case 2:
                    System.out.println("Thêm sản phẩm");
                    productService.add();
                    break;
                case 3:
                    System.out.println("Xóa sản phẩm");
                    productService.remove();
                    break;
                case 4:
                    System.out.println("Chỉnh sửa sản phẩm");
                    productService.edit();
                    break;
                case 5:
                    System.out.println("Tìm kiếm sản phẩm");
                    productService.searchName();
                    break;
                case 6:
                    boolean flag1 = true;
                    do {
                        System.out.println("Sắp xếp sản phẩm :" +
                                "\n1.Tăng dần theo giá" +
                                "\n2.Giảm dần theo giá");
                        int pick = Integer.parseInt(scanner.nextLine());
                        if (pick == 1) {
                            productService.sortUpProduct();
                            productService.display();
                            break;
                        } else if (pick == 2) {
                            productService.sortDownProduct();
                            productService.display();
                            break;
                        }
                    } while (flag1);
                    break;
                case 7:
                    System.exit(0);
                default:
                    flag = false;

            }
        } while (flag);

    }
}
