public class Circle {
    double radius;

    // Default constructor
    public Circle() {
        this(1.0);  // calls the parameterized constructor
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }
}
