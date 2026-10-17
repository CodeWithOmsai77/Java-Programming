import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextFile {
    public static void main(String[] args) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("java-notes.txt"))) {
            writer.println("My Java learning notes");
            writer.println("Topics: fundamentals, OOP, inheritance, exceptions.");
            System.out.println("Notes written to java-notes.txt");
        } catch (IOException e) {
            System.out.println("Could not write the file: " + e.getMessage());
        }
    }
}
