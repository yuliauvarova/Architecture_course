package HW10;

public class Main {

    public static void main(String[] args) {
        //создаем три продукта
        Product product1 = new Product(1, "BottleOfWater", 10.0);
        Product product2 = new Product(2, "Chips", 12.0);
        Product product3 = new Product(3, "Chocolate", 15.0);

        //создаем экземпляр UnitOfWork, взаимодействуя с которым можно добавлять продукты в список одной транзакцией
        UnitOfWork unow1 = new UnitOfWork();

        unow1.addNewProduct(product1);
        unow1.addNewProduct(product2);
        unow1.addNewProduct(product3);

        //совершаем транзакцию
        unow1.commit();

        unow1.productService.productRepository.dao.print();
        System.out.println("----------------");

        //создаем три продукта
        Product product4 = new Product(4, "BottleOfWater", 100.0);
        Product product5 = new Product(5, "Chips", 120.0);
        Product product6 = new Product(6, "Chocolate", 150.0);

        //создаем экземпляр UnitOfWork, взаимодействуя с которым можно добавлять продукты в список одной транзакцией
        UnitOfWork unow2 = new UnitOfWork();

        unow2.addNewProduct(product4);
        unow2.addNewProduct(product5);
        unow2.addNewProduct(product6);

        //отменяем транзакцию
        unow2.rollBack();

        //подстверждение транзакции не работает
        unow2.commit();

        unow2.productService.productRepository.dao.print();

    }
}
