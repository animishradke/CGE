import java.util.Scanner;


public class meth310 {
public static boolean areCollinearBySlope(int x1, int y1, int x2, int
y2, int x3, int y3) {
double slopeAB = (double)(y2 - y1) / (x2 - x1);
double slopeBC = (double)(y3 - y2) / (x3 - x2);
double slopeAC = (double)(y3 - y1) / (x3 - x1);
return (slopeAB == slopeBC) &amp;&amp; (slopeBC == slopeAC);
}
// Method 2: Using Area of Triangle Formula
public static boolean areCollinearByArea(int x1, int y1, int x2, int
y2, int x3, int y3) {
double area = 0.5 * (x1 * (y2 - y3) +
x2 * (y3 - y1) +
x3 * (y1 - y2));
return area == 0;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
// Sample input: 2 4 4 6 6 8
System.out.println(&quot;Enter coordinates of 3 points (x1 y1 x2 y2 x3
y3):&quot;);
int x1 = sc.nextInt();
int y1 = sc.nextInt();
int x2 = sc.nextInt();
int y2 = sc.nextInt();
int x3 = sc.nextInt();
int y3 = sc.nextInt();
// Check using slope method
boolean slopeCollinear = areCollinearBySlope(x1, y1, x2, y2, x3,
y3);
// Check using area method
boolean areaCollinear = areCollinearByArea(x1, y1, x2, y2, x3, y3);
System.out.println(&quot;\nUsing Slope Method: &quot; + (slopeCollinear ?

23

&quot;Collinear&quot; : &quot;Not Collinear&quot;));
System.out.println(&quot;Using Area Method : &quot; + (areaCollinear ?
&quot;Collinear&quot; : &quot;Not Collinear&quot;));
}
}