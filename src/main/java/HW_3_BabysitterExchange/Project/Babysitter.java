package HW_3_BabysitterExchange.Project;

//Класс babysitter наследуетсяот абстрактного Executor
public class Babysitter extends Executor {

    int ageOfKidMinimal; //min возраст, с которым готова работать няня

    int ageOfKidMaximal; //max возраст, с которым готова работать няня

    public Babysitter(String name, int pricePerHour, int age, int ageOfKidMinimal, int ageOfKidMaximal) {
        super(name, pricePerHour, age);
        this.ageOfKidMinimal = ageOfKidMinimal;
        this.ageOfKidMaximal = ageOfKidMaximal;
    }

    //Реализация метода takeOrder, имплементированного на уровне абстрактного класса
    @Override
    public void takeOrder(int orderId) {
        System.out.println("Babysitter takes order");
    }


    //Реализация метода leaveFeedback, имплементированного на уровне абстрактного класса
    @Override
    public void leaveFeedback() {
        System.out.println("Babysitter left feedback");
    }

    @Override
    public String toString() {
        return "Babysitter{" +
                "ageOfKidMinimal=" + ageOfKidMinimal +
                ", ageOfKidMaximal=" + ageOfKidMaximal +
                ", executorId=" + executorId +
                ", name='" + name + '\'' +
                ", pricePerHour=" + pricePerHour +
                ", age=" + age +
                '}';
    }
}
