import java.io.*;
import java.util.*;
class Employee implements Serializable {
    int id;
    String name;
    String department;
    double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + department + " - $" + salary;
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        String filename = "employees.ser";
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "Engineering", 95000),
            new Employee(2, "Bob", "Sales", 72000),
            new Employee(3, "Charlie", "HR", 64000)
        );
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(employees);
            System.out.println("Employees serialized to " + filename);
        } catch (IOException e) {
            System.out.println("Serialization error: " + e.getMessage());
        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            List<Employee> loadedEmployees = (List<Employee>) ois.readObject();
            System.out.println("\nDeserialized Employees:");
            for (Employee emp : loadedEmployees) {
                System.out.println(emp);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Deserialization error: " + e.getMessage());
        }
    }
}
