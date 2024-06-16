import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessingExample {
    public static void main(String[] args) {
        String fileName = "input.txt"; // Specify the file name

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Process each line (you can modify this part)
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
