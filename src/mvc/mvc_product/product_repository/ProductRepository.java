package mvc.mvc_product.product_repository;

import mvc.mvc_car.utils.ReadAndWrite;
import mvc.mvc_product.product_model.Product;
import mvc.mvc_product.product_utils.ReadAndWriteProduct;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    @Override
    public List<Product> displayProduct() {
        List<String> stringList = ReadAndWriteProduct.readFileBook(ReadAndWriteProduct.PATH_FILE_PRODUCT);
        List<Product> productList = new ArrayList<>();
        String[] info;
        for (String s : stringList) {
            info = s.split(",");
            Product product = new Product(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), info[3]);
            productList.add(product);
        }
        return productList;
    }

    @Override
    public void addNewProduct(Product product) {
        List<String> stringList = ReadAndWriteProduct.readFileBook(ReadAndWriteProduct.PATH_FILE_PRODUCT);
        stringList.add(product.convertToString());
        ReadAndWrite.writeFileBook(ReadAndWriteProduct.PATH_FILE_PRODUCT, stringList, false);
    }

    @Override
    public void removeProduct(int index) {
        List<String> stringList = ReadAndWriteProduct.readFileBook(ReadAndWriteProduct.PATH_FILE_PRODUCT);
        stringList.remove(index);
        ReadAndWriteProduct.writeFileBook(ReadAndWriteProduct.PATH_FILE_PRODUCT, stringList, false);
    }

    @Override
    public void editProduct(int index, Product product) {
        List<String> stringList = ReadAndWriteProduct.readFileBook(ReadAndWriteProduct.PATH_FILE_PRODUCT);
        stringList.set(index, product.convertToString());
        ReadAndWriteProduct.writeFileBook(ReadAndWriteProduct.PATH_FILE_PRODUCT, stringList, false);
    }

    @Override
    public int searchId(int id) {
        for (int i = 0; i < displayProduct().size(); i++) {
            if (displayProduct().get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public Product getProduct(int index) {
        return displayProduct().get(index);
    }


}
