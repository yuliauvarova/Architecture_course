package HW_3_BabysitterExchange.Project;

//Класс "Ребенок"
public class Kid {

    int kidId;
    private static int counter;

    {
        kidId = ++counter;
    }
    String name; //имя

    int age; //возраст

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Kid " + kidId + "{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
