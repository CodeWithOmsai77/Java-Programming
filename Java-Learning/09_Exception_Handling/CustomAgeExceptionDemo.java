import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomAgeExceptionDemo {
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be at least 18.");
        }
        System.out.println("Age accepted.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = Integer.parseInt(in.nextLine());
            checkAge(age);
        } catch (NumberFormatException e) {
            System.out.println("Please enter a whole number.");
        } catch (InvalidAgeException e) {
            System.out.println("Validation failed: " + e.getMessage());
        } finally {
            in.close();
        }
    }
}
