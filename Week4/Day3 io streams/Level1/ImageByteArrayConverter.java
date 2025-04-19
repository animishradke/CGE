import java.io.*;
import java.nio.file.Files;

public class ImageByteArrayConverter {
    public static void main(String[] args) {
        String sourcePath = "source.jpg"; 
        String targetPath = "copy.jpg";        

        try {
            byte[] imageBytes;
            try (FileInputStream fis = new FileInputStream(sourcePath);
                 ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = fis.read(buffer)) != -1) {
                    baos.write(buffer, bytesRead);
                }
                imageBytes = baos.toByteArray();
            }
            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                 FileOutputStream fos = new FileOutputStream(targetPath)) {
                byte[] buffer = new byte[4096];
                int bytesRead;
                while ((bytesRead = bais.read(buffer)) != -1) {
                    fos.write(buffer, 0, bytesRead);
                }
            }
            boolean identical = Files.mismatch(
                new File(sourcePath).toPath(),
                new File(targetPath).toPath()
            ) == -1;

            System.out.println("Image copied successfully.");
            System.out.println("Files are identical: " + identical);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
