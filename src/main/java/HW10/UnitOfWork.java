package HW10;

import java.util.ArrayList;
import java.util.List;

public class UnitOfWork {
    private List<Product> products = new ArrayList<>();
    private java.util.List<Product> newProducts = new ArrayList<>();
    private List<Product> deletedProducts = new ArrayList<>();

    ProductService productService = new ProductService(new ProductRepository(new InMemoryProductDao() {
    }));


    // Метод для добавления продукта в список новых продуктов
    public void addNewProduct(Product product) {
        //productService.addProductWithPriceControl(product);
        newProducts.add(product);
    }

    // Метод для удаления продукта из списка продуктов
    public void deleteProduct(Product product) {
        products.remove(product);
        deletedProducts.add(product);
    }

    public void rollBack(){
        newProducts.clear();
        deletedProducts.clear();
    }

    // Метод для сохранения всех изменений
    public void commit() {
        for (Product product: newProducts) {
            productService.addProductWithPriceControl(product);
        }
        for (Product product: deletedProducts) {
            productService.deleteProductWithPriceControl(product);
        }
        newProducts.clear();
        deletedProducts.clear();
    }

    public void cancelTransaction(){

    }
}
