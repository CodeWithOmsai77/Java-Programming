class Fresher {
    private final String name;
    private final int age;

    Fresher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ParameterizedConstructorDemo {
    public static void main(String[] args) {
        new Fresher("Omsai", 20).display();
        new Fresher("Rahul", 19).display();
        new Fresher("Om", 21).display();
    }
}
