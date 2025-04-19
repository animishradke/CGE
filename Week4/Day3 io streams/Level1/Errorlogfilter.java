import java.io.*;

public class ErrorLogFilter {
    public static void main(String[] args) {
        String filePath = "path/to/your/largefile.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}
