public double[] calculateTrigonometricFunctions(double angle)
class meth112 {
public double[] calculateTrigonometricFunctions(double angle) {
double radians = Math.toRadians(angle);
double sine = Math.sin(radians);
double cosine = Math.cos(radians);
double tangent = Math.tan(radians);
return new double[]{sine, cosine, tangent};
}
public static void main(String[] args) {
TrigonometryCalculator calculator = new
TrigonometryCalculator();
double angle = 45.0; // Example angle in degrees
double[] results =
calculator.calculateTrigonometricFunctions(angle);
System.out.println(&quot;Angle: &quot; + angle + &quot; degrees&quot;);
System.out.println(&quot;Sine: &quot; + results[0]);
System.out.println(&quot;Cosine: &quot; + results[1]);
System.out.println(&quot;Tangent: &quot; + results[2]);
}
}