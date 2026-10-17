import java.util.Scanner;

public class StringBasics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = in.nextLine();

        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("First character: " +
                (text.isEmpty() ? "(empty)" : text.charAt(0)));

        in.close();
    }
}
