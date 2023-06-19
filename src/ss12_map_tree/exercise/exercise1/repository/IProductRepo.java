package ss12_map_tree.exercise.exercise1.repository;

import ss12_map_tree.exercise.exercise1.model.Product;

public interface IProductRepo {
    void display();

    void add(Product product);

    void remove(int index);

    void edit(int index, Product product);

    void searchName(String name);

    void sortUpProduct();

    void sortDownProduct();

}
