import java.io.*;

public class StudentDataStream {
    public static void main(String[] args) {
        String fileName = "students.dat";
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(101);
            dos.writeUTF("Alice");
            dos.writeDouble(3.8);

            dos.writeInt(102);
            dos.writeUTF("Bob");
            dos.writeDouble(3.6);

            dos.writeInt(103);
            dos.writeUTF("Charlie");
            dos.writeDouble(3.9);
        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            while (dis.available() > 0) {
                int roll = dis.readInt();
                String name = dis.readUTF();
                double gpa = dis.readDouble();

                System.out.println("Roll: " + roll + ", Name: " + name + ", GPA: " + gpa);
            }
        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }
}
