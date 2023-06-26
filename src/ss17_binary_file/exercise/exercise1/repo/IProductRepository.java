package ss17_binary_file.exercise.exercise1.repo;

import ss17_binary_file.exercise.exercise1.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> displayList();
    void addProduct(Product product);
    void searchProduct(int id);
    int searchIndex(int id);

}
