//Приложение биржи, для можно найти нянь и учителей для детей


package HW_3_BabysitterExchange.Project;

import java.util.LinkedList;
import java.util.List;

import static HW_3_BabysitterExchange.Project.KidsRepresentative.Status.PARENT;

public class Main {
    public static void main(String[] args) {

        List<Kid> kids1 = new LinkedList<>();
        kids1.add(new Kid("John", 5));
        kids1.add(new Kid("Sam", 8));

        KidsRepresentative client1 = new KidsRepresentative(PARENT, "Mary", kids1);

        System.out.println(client1);

        Babysitter babysitter1 = new Babysitter("Helen", 20, 22, 10, 15);
        Babysitter babysitter2 = new Babysitter("Selen", 10, 16, 8, 12);

        System.out.println(babysitter1);


        Order order = client1.makeOrder();

        System.out.println(order.orderId);

        order.payments = new PayByBankCard();

        order.doPayment(3000);

        client1.leaveFeedback();

        babysitter2.leaveFeedback();
    }
}
