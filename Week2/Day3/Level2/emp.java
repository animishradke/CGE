class Employee {
public int employeeID;
protected String department;
private double salary;
public Employee(int employeeID, String department, double salary) {
this.employeeID = employeeID;
this.department = department;
this.salary = salary;
}
public void setSalary(double salary) {
if (salary &gt; 0) {
this.salary = salary;
} else {
System.out.println(&quot;Salary must be positive.&quot;);
}
}
public double getSalary() {
return salary;
}
public void displayInfo() {
System.out.println(&quot;Employee ID: &quot; + employeeID);
System.out.println(&quot;Department: &quot; + department);
System.out.println(&quot;Salary: &quot; + salary);
}
}
class Manager extends Employee {
public Manager(int employeeID, String department, double salary) {
super(employeeID, department, salary);
}
public void displayManagerInfo() {
System.out.println(&quot;Manager ID: &quot; + employeeID);
System.out.println(&quot;Department: &quot; + department);
}
}

public class EmployeeRecords {
public static void main(String[] args) {
Employee emp = new Employee(101, &quot;IT&quot;, 50000);
emp.displayInfo();
System.out.println(&quot;\nUpdating salary...&quot;);
emp.setSalary(55000);
emp.displayInfo();
System.out.println(&quot;\nManager Details:&quot;);
Manager mgr = new Manager(201, &quot;HR&quot;, 70000);
mgr.displayManagerInfo();
}
}