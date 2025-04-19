
import java.util.*;
import java.util.stream.*;
import java.util.function.*;
import java.text.DecimalFormat;

class Employee {
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

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return id + " - " + name + " - " + department + " - $" + salary;
    }
}

public class cf1 {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Alice", "Engineering", 90000),
            new Employee(2, "Bob", "HR", 70000),
            new Employee(3, "Charlie", "Engineering", 85000),
            new Employee(4, "David", "Engineering", 78000),
            new Employee(5, "Eva", "Marketing", 82000),
            new Employee(6, "Frank", "Engineering", 95000)
        );

        List<Employee> filteredSorted = employees.stream()
            .filter(e -> e.getDepartment().equals("Engineering") && e.getSalary() > 80000)
            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
            .collect(Collectors.toList());

        System.out.println("Filtered & Sorted Employees:");
        filteredSorted.forEach(System.out::println);

        Map<String, List<Employee>> grouped = filteredSorted.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

        Map<String, Double> avgSalaryByDept = grouped.entrySet().stream()
            .collect(Collectors.toMap(
                Map.Entry::getKey,
                e -> e.getValue().stream().mapToDouble(Employee::getSalary).average().orElse(0.0)
            ));

        System.out.println("\nAverage Salary by Department:");
        avgSalaryByDept.forEach((dept, avg) ->
            System.out.println(dept + ": $" + new DecimalFormat("#.00").format(avg)));
    }
}
