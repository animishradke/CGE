class Employee{
private String name;
private int id;
private double salary;
//constructor
public Employee(String name,int id,double salary){
this.name=name;
this.id=id;
this.salary=salary;
}
public void displayDetails(){
System.out.println("Employee ID:"+id);
System.out.println("EMployee Name:"+name);
System.out.println("EMployee Salary:$"+salary);
System.out.println("--------------------------");
}
public static void main(String[] args){

Employee emp1=new Employee("Alice",101,50000);
Employee emp2=new Employee("Bob",102,60000);

emp1.displayDetails();
emp2.displayDetails();
}
}