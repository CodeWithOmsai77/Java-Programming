import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n---- Calculator ----");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Power");
            System.out.println("7. Square root");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            if (!in.hasNextInt()) {
                System.out.println("Please enter a menu number.");
                in.nextLine();
                continue;
            }
            choice = in.nextInt();

            if (choice == 0) {
                System.out.println("Calculator closed.");
                break;
            }

            if (choice == 7) {
                System.out.print("Enter a number: ");
                double value = in.nextDouble();
                if (value < 0) {
                    System.out.println("Square root of a negative number is not real.");
                } else {
                    System.out.println("Result: " + Math.sqrt(value));
                }
                continue;
            }

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice.");
                continue;
            }

            System.out.print("Enter two numbers: ");
            double first = in.nextDouble();
            double second = in.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (first + second));
                    break;
                case 2:
                    System.out.println("Result: " + (first - second));
                    break;
                case 3:
                    System.out.println("Result: " + (first * second));
                    break;
                case 4:
                    if (second == 0) System.out.println("Cannot divide by zero.");
                    else System.out.println("Result: " + (first / second));
                    break;
                case 5:
                    if (second == 0) System.out.println("Cannot use zero as the divisor.");
                    else System.out.println("Result: " + (first % second));
                    break;
                case 6:
                    System.out.println("Result: " + Math.pow(first, second));
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (true);

        in.close();
    }
}
