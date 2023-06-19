package ss12_map_tree.exercise.exercise1.service;

import ss12_map_tree.exercise.exercise1.model.Product;
import ss12_map_tree.exercise.exercise1.repository.ProductRepo;

import java.util.Collections;

import static ss12_map_tree.exercise.exercise1.view.Main.scanner;

public class ProductService implements IProductService {
    ProductRepo productRepo = new ProductRepo();

    @Override
    public void display() {
        productRepo.display();
    }

    @Override
    public void add() {
        System.out.println("Nhập id sản phẩm :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm :");
        String name = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        productRepo.add(product);

    }

    @Override
    public void remove() {
        int index = searchId();
        if (index == -1) {
            System.out.println("Không tìm thấy id");
        } else {
            productRepo.remove(index);
        }
    }

    @Override
    public void edit() {
        display();
        System.out.println("Nhập id của Product muốn sửa");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên muốn sửa");
        String name = scanner.nextLine();
        System.out.println("Nhập giá muốn sửa");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(id, name, price);
        productRepo.edit(id, product);
    }

    @Override
    public void searchName() {
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        productRepo.searchName(name);
    }

    public int searchId() {
        System.out.println("Nhập id sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        return productRepo.seachId(id);

    }

    @Override
    public void sortUpProduct() {

        productRepo.sortUpProduct();

    }

    @Override
    public void sortDownProduct() {
        productRepo.sortDownProduct();
    }
}
