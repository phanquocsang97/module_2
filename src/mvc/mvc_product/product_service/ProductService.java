package mvc.mvc_product.product_service;

import mvc.mvc_product.product_model.Product;
import mvc.mvc_product.product_repository.IProductRepository;
import mvc.mvc_product.product_repository.ProductRepository;
import mvc.mvc_product.product_utils.ReadAndWriteProduct;

import static mvc.mvc_product.product_view.Run.scanner;

public class ProductService implements IProductService{
    IProductRepository productRepository = new ProductRepository();
    @Override
    public void displayProduct() {
        for (Product product : productRepository.displayProduct()) {
            System.out.println(product);
        }
    }

    @Override
    public void addNewProduct() {
        System.out.println("enter new id ");
        int id = ReadAndWriteProduct.inputInt();
        int index = productRepository.searchId(id);
        if (index == -1){
            System.out.println("enter new name");
            String newName = scanner.nextLine();
            System.out.println("enter new price");
            int newPrice = ReadAndWriteProduct.inputInt();
            System.out.println("enter new brand");
            String newBrand = scanner.nextLine();
            Product product = new Product(id,newName,newPrice,newBrand);
            productRepository.addNewProduct(product);
            displayProduct();
        }else {
            System.out.println("id already exist");
        }
    }

    @Override
    public void removeProduct() {
        System.out.println("enter id you want to remove ");
        int id = ReadAndWriteProduct.inputInt();
        int index = productRepository.searchId(id);
        if (index == - 1){
            System.out.println("id doesnt exist");
        }else {
            System.out.println("enter yes to delete");
            String choice = scanner.nextLine().toLowerCase().trim();
            if (choice.equals("yes")){
                productRepository.removeProduct(index);
                displayProduct();
            }else {
                System.out.println("cancel");
            }
        }

    }

    @Override
    public void editProduct() {
        boolean flag = true;
        System.out.println("enter id you want to edit ");
        int id = ReadAndWriteProduct.inputInt();
        int index = productRepository.searchId(id);
        if (index == - 1){
            System.out.println("id doesnt exist");
        }else {
            Product product = productRepository.getProduct(index);
            do {
                System.out.println("Enter info you want to edit"+
                        "\n1.Edit id"+
                        "\n2.Edt name"+
                        "\n3.Edit price"+
                        "\n4.Edit brand"+
                        "\n5.Save info");
                int choose = ReadAndWriteProduct.inputInt();
                switch (choose){
                    case 1:
                        System.out.println("Edit id");
                        int newId = ReadAndWriteProduct.inputInt();
                        product.setId(newId);
                        break;
                    case 2:
                        System.out.println("Edit name");
                        String newName = scanner.nextLine();
                        product.setName(newName);
                        break;
                    case 3:
                        System.out.println("Edit price");
                        int newPrice = ReadAndWriteProduct.inputInt();
                        product.setPrice(newPrice);
                        break;
                    case 4:
                        System.out.println("Edit brand");
                        String newBrand = scanner.nextLine();
                        product.setBrand(newBrand);
                        break;
                    case 5:
                        System.out.println("Save info");
                        flag = false;
                        break;
                    default:
                        System.out.println("Input Wrong");
                        break;
                }
            }while (flag);
            System.out.println("Enter yes to save");
            String choice = scanner.nextLine().toLowerCase().trim();
            if (choice.equals("yes")){
                productRepository.editProduct(index,product);
                displayProduct();
            }else {
                System.out.println("cancel");
            }

        }
    }
}
