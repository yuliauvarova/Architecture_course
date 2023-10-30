package HW10;

import java.util.List;

public interface ProductDao {
    Product findById(int id);
    List<Product> findAll();
    void add(Product product);
    void save(Product product);
    void delete(int id);
    void print();
}
