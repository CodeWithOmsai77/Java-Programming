import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        int target = random.nextInt(100) + 1;
        int attempts = 7;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess a number from 1 to 100. You have 7 attempts.");

        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.print("Attempt " + attempt + ": ");
            if (!in.hasNextInt()) {
                System.out.println("Please enter a whole number.");
                in.next();
                attempt--;
                continue;
            }

            int guess = in.nextInt();
            if (guess == target) {
                System.out.println("Correct! You won in " + attempt + " attempt(s).");
                in.close();
                return;
            }
            System.out.println(guess < target ? "Too low." : "Too high.");
        }

        System.out.println("No attempts left. The number was " + target + ".");
        in.close();
    }
}
