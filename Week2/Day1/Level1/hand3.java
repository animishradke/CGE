import java.util.Scanner;
public class hand3 {
// Function to check if a number is prime
public static boolean isPrime(int number) {
if (number &lt;= 1) {
return false; // 0 and 1 are not prime
}
for (int i = 2; i &lt;= Math.sqrt(number); i++) { // optimize till
√number

if (number % i == 0) {
return false; // divisible by another number
}
}
return true; // no divisors found
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a number to check if it&#39;s prime: &quot;);
int num = scanner.nextInt();
if (isPrime(num)) {
System.out.println(num + &quot; is a prime number.&quot;);
} else {
System.out.println(num + &quot; is not a prime number.&quot;);
}
}
}