package mvc.mvc_product.product_repository;

import mvc.mvc_product.product_model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> displayProduct();
    void addNewProduct(Product product);
    void removeProduct(int index);
    void editProduct(int index, Product product);
    int searchId(int id);
    Product getProduct(int index);
}
