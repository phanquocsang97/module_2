package ss12_map_tree.exercise.exercise1.repository;

import ss12_map_tree.exercise.exercise1.model.SortDownProduct;
import ss12_map_tree.exercise.exercise1.model.SortUpProduct;
import ss12_map_tree.exercise.exercise1.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

import static ss12_map_tree.exercise.exercise1.view.Main.scanner;

public class ProductRepo implements IProductRepo {
    static ArrayList<Product> productArrayList = new ArrayList<>();

    static {
        productArrayList.add(new Product(1, "BMW", 1000));
        productArrayList.add(new Product(2, "Mercedes", 900));
        productArrayList.add(new Product(3, "Audi", 800));
    }


    @Override
    public void display() {
        for (Product product : productArrayList) {
            System.out.println(product);
        }
    }

    @Override
    public void add(Product product) {
        productArrayList.add(product);
    }

    @Override
    public void remove(int index) {
        String result;
        System.out.println(productArrayList.get(index));
        System.out.println("Nhập yes để xóa");
        result = scanner.nextLine().toLowerCase();
        if (result.equals("yes")) {
            productArrayList.remove(index);
        } else {
            System.out.println("cancel");
        }
    }

    @Override
    public void edit(int id, Product product) {
        int index1 = seachId(id);
        productArrayList.set(index1, product);
    }

    public int seachId(int id) {
        for (int i = 0; i < productArrayList.size(); i++) {
            if (id == productArrayList.get(i).getId()) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void searchName(String name) {
        for (Product product : productArrayList) {
            if (Objects.equals(name, product.getNameProduct())) {
                System.out.println(product);
                break;
            }
        }
    }

    @Override
    public void sortUpProduct() {
        productArrayList.sort(new SortUpProduct());
    }

    @Override
    public void sortDownProduct() {
        productArrayList.sort(new SortDownProduct());
    }
}
