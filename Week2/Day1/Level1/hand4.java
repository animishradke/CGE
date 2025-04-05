import java.util.Scanner;
public class hand4 {
// Function to generate and print the Fibonacci sequence
public static void generateFibonacci(int terms) {
int first = 0, second = 1;
System.out.println(&quot;Fibonacci Sequence:&quot;);

for (int i = 1; i &lt;= terms; i++) {
System.out.print(first + &quot; &quot;);
int next = first + second;
first = second;
second = next;
}
System.out.println();
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter number of terms: &quot;);
int numTerms = scanner.nextInt();
if (numTerms &lt;= 0) {
System.out.println(&quot;Please enter a positive number.&quot;);
} else {
generateFibonacci(numTerms);
}
}
}