import java.util.Scanner;

public class MultipleCatchDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] values = {10, 20, 30};

        try {
            System.out.print("Enter an array index (0 to 2): ");
            int index = Integer.parseInt(in.nextLine());
            System.out.println("Value: " + values[index]);
        } catch (NumberFormatException e) {
            System.out.println("Index must be an integer.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is outside the array.");
        } finally {
            in.close();
        }
    }
}
