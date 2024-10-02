// Product Interface
interface Animal {
    void speak();
}

// Concrete Products
class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}

// Factory Class
class AnimalFactory {
    public Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("Cat")) {
            return new Cat();
        } else {
            throw new IllegalArgumentException("Unknown animal type.");
        }
    }
}

// Use Case
public class FactoryPatternDemo {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.createAnimal("Dog");
        dog.speak();  // Output: Woof!

        Animal cat = factory.createAnimal("Cat");
        cat.speak();  // Output: Meow!
    }
}
