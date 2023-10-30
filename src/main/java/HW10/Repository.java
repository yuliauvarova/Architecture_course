package HW10;

import java.util.List;

public interface Repository<E> {
    E getById(int id);
    List<E> getAll();
    void add(Product product);
    void update(E e);
    void delete(int id);
}
