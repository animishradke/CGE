public class hand6 {
// Function to take input from the user
public static int getInput() {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a non-negative integer: &quot;);
return scanner.nextInt();
}
// Recursive function to calculate factorial
public static long factorial(int n) {
if (n == 0 || n == 1)
return 1;
return n * factorial(n - 1);
}
// Function to display the result
public static void displayResult(int number, long result) {
System.out.println(&quot;Factorial of &quot; + number + &quot; is: &quot; + result);
}
public static void main(String[] args) {
int number = getInput();
if (number &lt; 0) {
System.out.println(&quot;Factorial is not defined for negative
numbers.&quot;);
} else {
long result = factorial(number);
displayResult(number, result);
}
}
}