import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = in.nextDouble();
        System.out.print("Enter b: ");
        double b = in.nextDouble();
        System.out.print("Enter c: ");
        double c = in.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println(c == 0
                        ? "Every value satisfies the equation."
                        : "No solution.");
            } else {
                System.out.println("Linear equation root: " + (-c / b));
            }
            in.close();
            return;
        }

        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Two distinct real roots: " + root1 + ", " + root2);
        } else if (discriminant == 0) {
            System.out.println("Repeated real root: " + (-b / (2 * a)));
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Complex roots: " + real + " + " + imaginary + "i");
            System.out.println("               " + real + " - " + imaginary + "i");
        }

        in.close();
    }
}
