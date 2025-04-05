import java.util.Scanner;
public hand2 {
// Function to take an integer input from the user
public static int getInput(String message) {
Scanner scanner = new Scanner(System.in);
System.out.print(message);
return scanner.nextInt();
}

// Function to find the maximum of three integers
public static int findMaximum(int a, int b, int c) {
int max = a;
if (b &gt; max) {
max = b;
}
if (c &gt; max) {
max = c;
}
return max;
}
public static void main(String[] args) {
int num1 = getInput(&quot;Enter first number: &quot;);
int num2 = getInput(&quot;Enter second number: &quot;);
int num3 = getInput(&quot;Enter third number: &quot;);
int maximum = findMaximum(num1, num2, num3);
System.out.println(&quot;The maximum of the three numbers is: &quot; +
maximum);
}
}