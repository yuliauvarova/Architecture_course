package HW10;


// Пример сервисного слоя для бизнес-логики
public class ProductService {
    ProductRepository productRepository = new ProductRepository(new InMemoryProductDao());

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public void addProductWithPriceControl(Product product) {
        if (product.getPrice()>0) {
            productRepository.add(product);
        }
    }

    public void deleteProductWithPriceControl(Product product) {
        if (product.getPrice()>0) {
            productRepository.delete(product.getId());
        }
    }
}
