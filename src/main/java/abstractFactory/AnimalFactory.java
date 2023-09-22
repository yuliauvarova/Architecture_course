package abstractFactory;

// Интерфейс для создания семейства животных
interface AnimalFactory {
    Lion createLion();
    Duck createDuck();
}

// Класс Lion (лев)
class Lion {
    public void roar() {
        System.out.println("Lion roars!");
    }
}

// Класс Duck (утка)
class Duck {
    public void quack() {
        System.out.println("Duck quacks!");
    }
}

// Конкретная фабрика для африканских животных
class AfricanAnimalFactory implements AnimalFactory {
    @Override
    public Lion createLion() {
        return new Lion();
    }

    @Override
    public Duck createDuck() {
        return new Duck();
    }
}

// Конкретная фабрика для азиатских животных
class AsianAnimalFactory implements AnimalFactory {
    @Override
    public Lion createLion() {
        return new Lion();
    }

    @Override
    public Duck createDuck() {
        return new Duck();
    }
}



