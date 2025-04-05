class Course {
    private String courseName;
    private int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }
}

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() {
        return platform;
    }

    public boolean isRecorded() {
        return isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount;

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getFee() {
        return fee;
    }

    public double getDiscount() {
        return discount;
    }

    public double getFinalFee() {
        return fee - (fee * discount / 100);
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + getCourseName());
        System.out.println("Duration: " + getDuration() + " hrs");
        System.out.println("Platform: " + getPlatform());
        System.out.println("Recorded: " + (isRecorded() ? "Yes" : "No"));
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee: $" + getFinalFee());
    }
}

public class CourseHierarchyDemo {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse(
            "Full Stack Web Development", 60, "Udemy", true, 500.0, 20.0
        );
        course.displayCourseDetails();
    }
}
