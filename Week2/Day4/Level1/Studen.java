public class Student {
    static String universityName = "Global Tech University";
    private static int totalStudents = 0;
    private final int rollNumber;
    private String name;
    private char grade;

    public Student(int rollNumber, String name, char grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("Total Enrolled Students: " + totalStudents);
    }

    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University Name : " + universityName);
            System.out.println("Roll Number : " + rollNumber);
            System.out.println("Name : " + name);
            System.out.println("Grade : " + grade);
        } else {
            System.out.println("Invalid student object.");
        }
    }

    public void updateGrade(char newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated successfully for Roll Number: " + rollNumber);
        }
    }
}
