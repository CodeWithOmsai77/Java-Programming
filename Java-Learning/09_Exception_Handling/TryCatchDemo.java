import java.util.Scanner;

public class TryCatchDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = Integer.parseInt(in.nextLine());

            System.out.print("Enter denominator: ");
            int denominator = Integer.parseInt(in.nextLine());

            System.out.println("Result: " + (numerator / denominator));
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integers.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } finally {
            System.out.println("Program finished.");
            in.close();
        }
    }
}
