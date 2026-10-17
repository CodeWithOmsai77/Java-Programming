import java.util.Scanner;

public class ExpenseTracker {
    private static final int CAPACITY = 50;
    private static final String[] descriptions = new String[CAPACITY];
    private static final double[] amounts = new double[CAPACITY];
    private static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;

        System.out.println("=== Simple Expense Tracker ===");
        System.out.print("How many expenses (1-" + CAPACITY + ")? ");
        if (!in.hasNextInt()) {
            System.out.println("Enter a valid count.");
            in.close();
            return;
        }

        int requested = in.nextInt();
        in.nextLine();
        if (requested < 1 || requested > CAPACITY) {
            System.out.println("Count out of range.");
            in.close();
            return;
        }

        for (int i = 0; i < requested; i++) {
            System.out.print("Description for expense " + (i + 1) + ": ");
            descriptions[count] = in.nextLine();

            System.out.print("Amount: ");
            if (!in.hasNextDouble()) {
                System.out.println("Enter a valid amount.");
                in.close();
                return;
            }
            amounts[count] = in.nextDouble();
            in.nextLine();

            if (amounts[count] < 0) {
                System.out.println("Amount cannot be negative.");
                in.close();
                return;
            }

            total += amounts[count];
            count++;
        }

        System.out.println("\n--- Expense Summary ---");
        for (int i = 0; i < count; i++) {
            System.out.printf("%-24s %.2f%n", descriptions[i], amounts[i]);
        }
        System.out.printf("Total: %.2f%nAverage: %.2f%n", total, total / count);
        in.close();
    }
}
