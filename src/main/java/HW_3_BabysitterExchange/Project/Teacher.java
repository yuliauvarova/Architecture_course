package HW_3_BabysitterExchange.Project;

//Класс Teacher наследуетсяот абстрактного Executor
public class Teacher extends Executor {

    String subject; //предмет
    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", executorId=" + executorId +
                ", name='" + name + '\'' +
                ", pricePerHour=" + pricePerHour +
                ", age=" + age +
                '}';
    }

    public Teacher(String name, int pricePerHour, int age, String subject ) {
        super(name, pricePerHour, age);
        this.subject = subject;
    }

    @Override
    public void takeOrder(int orderId) {
        System.out.println("Teacher takes order");
    }

    @Override
    public void leaveFeedback() {
        System.out.println("Teacher left feedback");
    }
}
