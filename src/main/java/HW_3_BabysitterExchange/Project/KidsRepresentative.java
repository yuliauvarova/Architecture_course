package HW_3_BabysitterExchange.Project;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

//"Представитель ребенка" имплементирует интерфейс "Возможность оставить Отзыв"
public class KidsRepresentative implements LeavingFeedback{

    int kidsRepresentativeId;

    private static int counter;

    {
        kidsRepresentativeId = ++counter;
    }
    Status representativeStatus; //статус представителя
    String name; //имя
    List<Kid> kids = new LinkedList<>(); //список его детей

    public KidsRepresentative(Status representativeStatus, String name, List<Kid> kids) {
        this.representativeStatus = representativeStatus;
        this.name = name;
        this.kids = kids;
    }

    //Метод "создать заказ" с дефолтным способом оплаты по телефону
    public Order makeOrder() {
        Order order = new Order(new Date(), new PayByPhone() {
            @Override
            public void doTransaction(int amount) {

            }
        });
        //System.out.println("Order is made");
        order.setClient(this);
        return order;
    }

    //Реализация метода "оставить отзыв"
    @Override
    public void leaveFeedback() {
        System.out.println("Parent left feedback");
    }

    @Override
    public String toString() {
        return "KidsRepresentative{" +
                "kidsRepresentativeId=" + kidsRepresentativeId +
                ", representativeStatus=" + representativeStatus +
                ", name='" + name + '\'' +
                ", kids=" + kids +
                '}';
    }


    public enum Status{
        PARENT,
        GRANDPARENT,
        ADOPTIVEPARENT,
        OTHERSTATUS
    }
}


