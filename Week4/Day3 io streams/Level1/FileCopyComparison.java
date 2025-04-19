import java.io.*;

public class FileCopyComparison {
    public static void main(String[] args) throws IOException {
        String source = "largefile.dat";
        String unbufferedCopy = "unbuffered_copy.dat";
        String bufferedCopy = "buffered_copy.dat";

        long start, end;
        start = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(unbufferedCopy)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
        end = System.nanoTime();
        System.out.println("Unbuffered Copy Time: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(bufferedCopy))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
        end = System.nanoTime();
        System.out.println("Buffered Copy Time: " + (end - start) / 1_000_000 + " ms");
    }
}
