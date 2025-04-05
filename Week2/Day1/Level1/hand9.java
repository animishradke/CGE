import java.util.Scanner;
public class Calculator {
public static double add(double a, double b) {
return a + b;
}
public static double subtract(double a, double b) {
return a - b;
}
public static double multiply(double a, double b) {
return a * b;
}
public static double divide(double a, double b) {
if (b == 0) {
System.out.println(&quot;Error: Division by zero is not allowed.&quot;);
return 0;
}
return a / b;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter first number: &quot;);
double num1 = scanner.nextDouble();
System.out.print(&quot;Enter second number: &quot;);
double num2 = scanner.nextDouble();
System.out.println(&quot;Choose operation:&quot;);
System.out.println(&quot;1. Addition (+)&quot;);
System.out.println(&quot;2. Subtraction (-)&quot;);
System.out.println(&quot;3. Multiplication (*)&quot;);

System.out.println(&quot;4. Division (/)&quot;);
int choice = scanner.nextInt();
double result = 0;
switch (choice) {
case 1:
result = add(num1, num2);
System.out.println(&quot;Result: &quot; + result);
break;
case 2:
result = subtract(num1, num2);
System.out.println(&quot;Result: &quot; + result);
break;
case 3:
result = multiply(num1, num2);
System.out.println(&quot;Result: &quot; + result);
break;
case 4:
result = divide(num1, num2);
System.out.println(&quot;Result: &quot; + result);
break;
default:
System.out.println(&quot;Invalid choice.&quot;);
}
}
}