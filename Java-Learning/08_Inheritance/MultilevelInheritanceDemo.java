class LivingThing {
    void breathe() {
        System.out.println("Living things breathe.");
    }
}

class Animal extends LivingThing {
    void move() {
        System.out.println("Animals can move.");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Some birds can fly.");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.breathe();
        bird.move();
        bird.fly();
    }
}
