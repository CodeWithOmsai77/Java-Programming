class Animal {
    void makeSound() {
        System.out.println("An animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        Animal first = new Animal();
        Animal second = new Dog();

        first.makeSound();
        second.makeSound();
    }
}
