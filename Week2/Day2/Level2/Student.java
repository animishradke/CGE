class Student{
private String name;
private int rollNumber;
private double marks;

public Student(String name,int rollNumber,double marks){
 this.name=name;
 this.rollNumber=rollNumber;
 this.marks=marks;
}

 public String calculateGrade() {
        if (marks >= 90) {
            return "A+";
        } else if (marks >= 80) {
            return "A";
        } else if (marks >= 70) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else if (marks >= 50) {
            return "D";
        } else {
            return "F (Fail)";
        }
    }
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("--------------------------");
    }
	
	public static void main(String[] args){
	Student student1=new Student("Animish",101,8);
	Student student2=new Student("Anim",101,5);
	Student student3=new Student("nimish",101,85);
	 student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
	
	}