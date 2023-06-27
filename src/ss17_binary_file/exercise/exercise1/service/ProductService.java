package ss17_binary_file.exercise.exercise1.service;

import ss17_binary_file.exercise.exercise1.common.IdNotFound;
import ss17_binary_file.exercise.exercise1.model.Product;
import ss17_binary_file.exercise.exercise1.repo.IProductRepository;
import ss17_binary_file.exercise.exercise1.repo.ProductRepository;

import java.util.List;

import static ss17_binary_file.exercise.exercise1.view.Main.scanner;

public class ProductService implements IProductService {
    IProductRepository productRepository = new ProductRepository();


    @Override
    public void displayList() {
        List<Product> productList = productRepository.displayList();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void addProduct() {
        System.out.println("Enter id of Product : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name of Product : ");
        String name = scanner.nextLine();
        System.out.println("Enter price of Product : ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter brand of Product : ");
        String brand = scanner.nextLine();
        System.out.println("Enter description of Product : ");
        String description = scanner.nextLine();
        Product product = new Product(id, name, price, brand, description);
        productRepository.addProduct(product);
    }

    @Override
    public void searchProduct() {
        try {
            System.out.println("Enter ID of Product you want to search : ");
            int id = Integer.parseInt(scanner.nextLine());
            if (productRepository.searchIndex(id) == -1) {
                throw new IdNotFound();
            } else {
                productRepository.searchProduct(id);
            }
        } catch (IdNotFound e) {
            System.out.println("ID not found !!!");
        }
    }
}
