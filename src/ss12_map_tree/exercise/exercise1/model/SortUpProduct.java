package ss12_map_tree.exercise.exercise1.model;

import java.util.Comparator;

public class SortUpProduct implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return (int) (o1.getPrice() - o2.getPrice());
    }
}
