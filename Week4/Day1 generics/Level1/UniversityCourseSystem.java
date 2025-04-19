package Level1;

import java.util.ArrayList;
import java.util.List;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract String getEvaluationMethod();
}

class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }

    public String getEvaluationMethod() {
        return "Evaluation: Exam-based";
    }
}

class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }

    public String getEvaluationMethod() {
        return "Evaluation: Assignment-based";
    }
}

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    public String getEvaluationMethod() {
        return "Evaluation: Research-based";
    }
}

class Course<T extends CourseType> {
    private T courseType;
    private String instructor;

    public Course(T courseType, String instructor) {
        this.courseType = courseType;
        this.instructor = instructor;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseType.getCourseName());
        System.out.println("Instructor: " + instructor);
        System.out.println(courseType.getEvaluationMethod());
        System.out.println();
    }

    public T getCourseType() {
        return courseType;
    }
}

class CourseManager {
    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            System.out.println("Course: " + course.getCourseName());
            System.out.println(course.getEvaluationMethod());
            System.out.println();
        }
    }
}

public class UniversityCourseSystem {
    public static void main(String[] args) {
        Course<ExamCourse> javaExamCourse = new Course<>(new ExamCourse("Java Programming"), "Dr. Smith");
        Course<AssignmentCourse> pythonAssignmentCourse = new Course<>(new AssignmentCourse("Python Programming"), "Prof. Johnson");
        Course<ResearchCourse> aiResearchCourse = new Course<>(new ResearchCourse("AI Research"), "Dr. Davis");

        List<CourseType> allCourses = new ArrayList<>();
        allCourses.add(javaExamCourse.getCourseType());
        allCourses.add(pythonAssignmentCourse.getCourseType());
        allCourses.add(aiResearchCourse.getCourseType());

        CourseManager.displayCourses(allCourses);
    }
}

