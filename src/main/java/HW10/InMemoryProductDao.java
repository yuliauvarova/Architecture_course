package HW10;

import java.util.ArrayList;
import java.util.List;

// Класс ProductDAO, который будет содержать методы для добавления,
// удаления и получения продуктов из базы данных (или списка).
public class InMemoryProductDao implements ProductDao {

    private List<Product> products = new ArrayList<>();
    private int nextId = 1;

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public void add(Product product) {
        product.setId(nextId++);
        products.add(product);
    }

    @Override
    public void save(Product product) {

    }

    @Override
    public void delete(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    @Override
    public void print(){
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
