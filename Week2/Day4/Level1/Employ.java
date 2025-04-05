public class Employee {
static String companyName = &quot;TechWave Solutions&quot;;
// Static counter to track total number of employees
private static int totalEmployees = 0;
private final String id;
private String name;
private String designation;
public Employee(String id, String name, String designation) {
this.id = id;
this.name = name;
this.designation = designation;
totalEmployees++;
}
public static void displayTotalEmployees() {
System.out.println(&quot;Total Employees: &quot; + totalEmployees);
}
public void displayDetails() {
System.out.println(&quot;Employee ID : &quot; + id);
System.out.println(&quot;Name : &quot; + name);
System.out.println(&quot;Designation : &quot; + designation);
System.out.println(&quot;Company : &quot; + companyName);
System.out.println(&quot;-----------------------------&quot;);
}
}
public class Main {
public static void main(String[] args) {
Employee e1 = new Employee(&quot;E101&quot;, &quot;Aditi Sharma&quot;, &quot;Software
Engineer&quot;);
Employee e2 = new Employee(&quot;E102&quot;, &quot;Rohit Verma&quot;, &quot;Product
Manager&quot;);
Employee e3 = new Employee(&quot;E103&quot;, &quot;Neha Rao&quot;, &quot;UI/UX Designer&quot;);
e1.displayDetails();
e2.displayDetails();
e3.displayDetails();

Employee.displayTotalEmployees();
}
}