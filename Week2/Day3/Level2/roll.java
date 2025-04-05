class Student {
public int rollNumber;
protected String name;
private double CGPA;
Student(int rollNumber, String name, double CGPA) {
this.rollNumber = rollNumber;
this.name = name;
this.CGPA = CGPA;
}
public double getCGPA() {
return CGPA;
}
public void setCGPA(double CGPA) {
this.CGPA = CGPA;
}
public void displayStudent() {
System.out.println(&quot;Roll Number: &quot; + rollNumber);
System.out.println(&quot;Name: &quot; + name);
System.out.println(&quot;CGPA: &quot; + CGPA);
}
}