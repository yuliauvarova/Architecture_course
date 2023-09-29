package HW_3_BabysitterExchange.Project;

// Абстрактный класс "Исполнитель"
public abstract class Executor implements takingOrder, LeavingFeedback {
    int executorId;

    private static int counter;

    {
        executorId = ++counter;
    }
    String name; //имя
    int pricePerHour; //цена в час
    int age; //возраст

    public Executor(String name, int pricePerHour, int age) {
        this.name = name;
        this.pricePerHour = pricePerHour;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public int getAge() {
        return age;
    }

}
