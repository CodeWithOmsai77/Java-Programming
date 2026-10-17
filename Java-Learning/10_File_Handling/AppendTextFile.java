import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class AppendTextFile {
    public static void main(String[] args) {
        try (PrintWriter writer =
                     new PrintWriter(new FileWriter("java-notes.txt", true))) {
            writer.println("Another note was added.");
            System.out.println("Text appended to java-notes.txt");
        } catch (IOException e) {
            System.out.println("Could not append to the file: " + e.getMessage());
        }
    }
}
