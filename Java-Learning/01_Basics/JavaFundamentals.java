import java.util.Scanner;

public class JavaFundamentals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age = 20;
        double height = 5.9;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);

        int a = 10;
        int b = 5;
        System.out.println("\nArithmetic operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Integer division: " + (a / b));
        System.out.println("Remainder: " + (a % b));

        double converted = a;
        System.out.println("Integer converted to double: " + converted);

        System.out.print("\nEnter your age: ");
        if (in.hasNextInt()) {
            int enteredAge = in.nextInt();
            System.out.println("You entered: " + enteredAge);
        } else {
            System.out.println("Please enter a whole number next time.");
        }

        in.close();
    }
}
