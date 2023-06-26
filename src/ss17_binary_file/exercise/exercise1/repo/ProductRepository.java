package ss17_binary_file.exercise.exercise1.repo;

import ss17_binary_file.exercise.exercise1.model.Product;
import ss17_binary_file.exercise.exercise1.util.WriteAndRead;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private static final String PATH_FILE = "D:\\CodeGym\\Module 2\\src\\ss17_binary_file\\exercise\\exercise1\\data\\data.dat";

    @Override
    public List<Product> displayList() {
        List<Product> productList = new ArrayList<>();
        productList = WriteAndRead.readFile(PATH_FILE);
        return productList;
    }

    @Override
    public void addProduct(Product product) {
        List<Product> productList = new ArrayList<>();
        productList = WriteAndRead.readFile(PATH_FILE);
        productList.add(product);
        WriteAndRead.writeFile(PATH_FILE, productList);
    }

    @Override
    public void searchProduct(int id) {
        List<Product> productList = displayList();
        System.out.println(productList.get(searchIndex(id)));
    }

    @Override
    public int searchIndex(int id) {
        List<Product> productList = displayList();
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }
}
