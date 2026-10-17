import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] questions = {
            "Which keyword creates an object?",
            "Which type stores true or false?",
            "Which loop checks its condition before each iteration?",
            "Which method is the Java program entry point?",
            "Which keyword starts a subclass declaration?"
        };
        String[][] options = {
            {"1. new", "2. make", "3. class"},
            {"1. int", "2. boolean", "3. char"},
            {"1. do-while", "2. while", "3. switch"},
            {"1. start()", "2. main()", "3. run()"},
            {"1. extends", "2. inherits", "3. super"}
        };
        int[] answers = {1, 2, 2, 2, 1};
        int score = 0;

        System.out.println("=== Java Basics Quiz ===");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQ" + (i + 1) + ". " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("Choose 1-3: ");

            if (!in.hasNextInt()) {
                System.out.println("Invalid input; question marked incorrect.");
                in.next();
                continue;
            }

            if (in.nextInt() == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. Correct option: " + answers[i]);
            }
        }

        System.out.println("\nFinal score: " + score + "/" + questions.length);
        in.close();
    }
}
