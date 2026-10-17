import java.util.Scanner;

public class LibraryBookTracker {
    private static final int CAPACITY = 20;
    private static final String[] titles = new String[CAPACITY];
    private static int count = 0;

    private static void addBook(Scanner in) {
        if (count == CAPACITY) {
            System.out.println("Library list is full.");
            return;
        }
        System.out.print("Enter book title: ");
        titles[count++] = in.nextLine().trim();
        System.out.println("Book added.");
    }

    private static void displayBooks() {
        if (count == 0) {
            System.out.println("No books added yet.");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + titles[i]);
        }
    }

    private static void searchBook(Scanner in) {
        System.out.print("Enter title to search: ");
        String target = in.nextLine().trim();
        for (int i = 0; i < count; i++) {
            if (titles[i].equalsIgnoreCase(target)) {
                System.out.println("Found at list position " + (i + 1) + ".");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Library Book Tracker ===");
            System.out.println("1. Add book  2. List books  3. Search  0. Exit");
            System.out.print("Choice: ");

            if (!in.hasNextInt()) {
                System.out.println("Enter a menu number.");
                in.nextLine();
                continue;
            }
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1: addBook(in); break;
                case 2: displayBooks(); break;
                case 3: searchBook(in); break;
                case 0: System.out.println("Goodbye."); break;
                default: System.out.println("Invalid choice.");
            }
        } while (choice != 0);

        in.close();
    }
}
