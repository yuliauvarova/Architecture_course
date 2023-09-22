package abstractFactory;

public class Main {
    public static void main(String[] args) {
        // Создаем фабрику для африканских животных
        AnimalFactory africanFactory = new AfricanAnimalFactory();

        // Создаем африканского льва и африканскую утку
        Lion africanLion = africanFactory.createLion();
        Duck africanDuck = africanFactory.createDuck();

        // Выводим звуки африканских животных
        africanLion.roar(); // Вывод: Lion roars!
        africanDuck.quack(); // Вывод: Duck quacks!

        // Создаем фабрику для азиатских животных
        AnimalFactory asianFactory = new AsianAnimalFactory();

        // Создаем азиатского льва и азиатскую утку
        Lion asianLion = asianFactory.createLion();
        Duck asianDuck = asianFactory.createDuck();

        // Выводим звуки азиатских животных
        asianLion.roar(); // Вывод: Lion roars!
        asianDuck.quack(); // Вывод: Duck quacks!
    }
}
