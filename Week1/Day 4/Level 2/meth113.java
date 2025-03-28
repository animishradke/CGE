import java.util.Scanner;
public class meth113 {
public static double calculateWindChill(double temp, double
windSpeed) {
return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) *
Math.pow(windSpeed, 0.16);
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter temperature (in Fahrenheit): &quot;);
double temp = scanner.nextDouble();
System.out.print(&quot;Enter wind speed (in mph): &quot;);
double windSpeed = scanner.nextDouble();
double windChill = calculateWindChill(temp, windSpeed);
System.out.println(&quot;The wind chill temperature is: &quot; +
windChill + &quot; °F&quot;);
}
}