import java.util.Scanner;
public class hand8 {
public static double celsiusToFahrenheit(double celsius) {
return (celsius * 9 / 5) + 32;
}
public static double fahrenheitToCelsius(double fahrenheit) {
return (fahrenheit - 32) * 5 / 9;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.println(&quot;Choose conversion type:&quot;);
System.out.println(&quot;1. Celsius to Fahrenheit&quot;);
System.out.println(&quot;2. Fahrenheit to Celsius&quot;);
int choice = scanner.nextInt();
if (choice == 1) {
System.out.print(&quot;Enter temperature in Celsius: &quot;);
double celsius = scanner.nextDouble();
double fahrenheit = celsiusToFahrenheit(celsius);
System.out.println(&quot;Temperature in Fahrenheit: &quot; + fahrenheit);
} else if (choice == 2) {
System.out.print(&quot;Enter temperature in Fahrenheit: &quot;);
double fahrenheit = scanner.nextDouble();
double celsius = fahrenheitToCelsius(fahrenheit);
System.out.println(&quot;Temperature in Celsius: &quot; + celsius);
} else {
System.out.println(&quot;Invalid choice.&quot;);
}
}
}