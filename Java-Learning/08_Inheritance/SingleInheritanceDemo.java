class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll number: " + rollNumber);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Student student = new Student("Om", 20, 101);
        student.displayStudent();
    }
}
