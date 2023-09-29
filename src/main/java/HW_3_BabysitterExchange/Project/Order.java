package HW_3_BabysitterExchange.Project;

import java.util.Date;

//Класс "Заказ"
public class Order {

    int orderId;
    private static int counter;

    {
        orderId = ++counter;
    }
    KidsRepresentative client; //заказчик
    Date date; //дата

    Payments payments; //класс оплат

    public Order(Date date, Payments payments) {
        //this.client = client;
        this.date = date;
        this.payments = payments;
    }

    //Метод "провести оплату"
    public void doPayment(int amount){
        payments.doTransaction(amount);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", client=" + client +
                ", date=" + date +
                ", payments=" + payments +
                '}';
    }

    public void setClient(KidsRepresentative client) {
        this.client = client;
    }
}
