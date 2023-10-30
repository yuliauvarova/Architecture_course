package HW10;

import java.util.List;

public class ProductRepository implements Repository{
    ProductDao dao = new InMemoryProductDao();

    public ProductRepository(InMemoryProductDao dao) {
        this.dao = dao;
    }


    //Метод поиска по id, включающий проверку на положительный номер id
    @Override
    public Object getById(int id) {
        if (id < 0){
            return -1;
        }
        return dao.findById(id);
    }

    @Override
    public List getAll() {
        return dao.findAll();
    }

    @Override
    public void add(Product product) {
        dao.add(product);
    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void delete(int id) {
        dao.delete(id);
    }
}
