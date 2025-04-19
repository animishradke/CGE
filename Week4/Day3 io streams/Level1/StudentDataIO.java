import java.io.*;

public class StudentDataIO {
    public static void main(String[] args) {
        String filename = "students.dat";
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(filename))) {
            out.writeInt(1);
            out.writeUTF("Alice");
            out.writeDouble(3.9);

            out.writeInt(2);
            out.writeUTF("Bob");
            out.writeDouble(3.7);

            out.writeInt(3);
            out.writeUTF("Charlie");
            out.writeDouble(4.0);
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
        try (DataInputStream in = new DataInputStream(new FileInputStream(filename))) {
            while (in.available() > 0) {
                int roll = in.readInt();
                String name = in.readUTF();
                double gpa = in.readDouble();
                System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
