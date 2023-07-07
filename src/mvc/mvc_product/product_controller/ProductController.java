package mvc.mvc_product.product_controller;

import mvc.mvc_product.product_service.IProductService;
import mvc.mvc_product.product_service.ProductService;
import mvc.mvc_product.product_utils.ReadAndWriteProduct;

public class ProductController {
     IProductService productService = new ProductService();
    public void displayMenu(){
        do {
            System.out.println("Product Management" +
                    "\n1.Display Product" +
                    "\n2.Add New Product" +
                    "\n3.Remove Product" +
                    "\n4.Edit Product" +
                    "\n5.Exit Program"
                    );
            int choose = ReadAndWriteProduct.inputInt();
            switch (choose){
                case 1:
                    System.out.println("Display Product");
                    productService.displayProduct();
                    break;
                case 2:
                    System.out.println("Add New Product");
                    productService.addNewProduct();
                    break;
                case 3:
                    System.out.println("Remove Product");
                    productService.removeProduct();
                    break;
                case 4:
                    System.out.println("Edit Product");
                    productService.editProduct();
                    break;
                case 5:
                    System.out.println("Exit Program");
                    System.exit(0);
                default:
                    System.out.println("Input Wrong!!");
                    break;
            }
        }while (true);
    }
}
