import java.util.Scanner;

class Student {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Enter name: ");
        student.name = in.nextLine();

        System.out.print("Enter age: ");
        if (!in.hasNextInt()) {
            System.out.println("Please enter a whole number.");
            in.close();
            return;
        }
        student.age = in.nextInt();

        student.display();
        in.close();
    }
}
