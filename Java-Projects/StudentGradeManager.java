import java.util.Scanner;

public class StudentGradeManager {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0.0;

        System.out.print("Enter student name: ");
        String name = in.nextLine();

        for (int subject = 1; subject <= 3; subject++) {
            System.out.print("Enter marks for subject " + subject + " (0-100): ");
            if (!in.hasNextDouble()) {
                System.out.println("Please enter numeric marks.");
                in.close();
                return;
            }

            double marks = in.nextDouble();
            if (marks < 0 || marks > 100) {
                System.out.println("Marks must be between 0 and 100.");
                in.close();
                return;
            }
            total += marks;
        }

        double average = total / 3.0;
        char grade = average >= 90 ? 'A' :
                     average >= 75 ? 'B' :
                     average >= 60 ? 'C' :
                     average >= 40 ? 'D' : 'F';

        System.out.println("\nStudent: " + name);
        System.out.printf("Total: %.2f / 300%n", total);
        System.out.printf("Average: %.2f%%%n", average);
        System.out.println("Grade: " + grade);
        in.close();
    }
}
