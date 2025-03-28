import java.util.Scanner;
public class meth39 {
static double calculateDistance(double x1, double y1, double x2, double
y2) {
return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
}
static double[] findLineEquation(double x1, double y1, double x2,
double y2) {
double[] result = new double[2];
double slope = (y2 - y1) / (x2 - x1);
double intercept = y1 - slope * x1;
result[0] = slope;
result[1] = intercept;
return result;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(&quot;Enter x1: &quot;);
double x1 = sc.nextDouble();
System.out.print(&quot;Enter y1: &quot;);
double y1 = sc.nextDouble();
System.out.print(&quot;Enter x2: &quot;);
double x2 = sc.nextDouble();
System.out.print(&quot;Enter y2: &quot;);
double y2 = sc.nextDouble();

21

double distance = calculateDistance(x1, y1, x2, y2);
System.out.printf(&quot;Euclidean Distance: %.2f\n&quot;, distance);
if (x1 == x2) {
System.out.println(&quot;Line is vertical. Equation: x = &quot; + x1);
} else {
double[] line = findLineEquation(x1, y1, x2, y2);
System.out.printf(&quot;Equation of Line: y = %.2fx + %.2f\n&quot;,
line[0], line[1]);
}
}
}