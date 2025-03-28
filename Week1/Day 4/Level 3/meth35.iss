import java.util.*;
public class meth35 {
public static boolean isPrime(int number) {
if (number &lt;= 1)
return false;
for (int i = 2; i &lt;= Math.sqrt(number); i++)
if (number % i == 0)
return false;
return true;
}
public static boolean isNeon(int number) {

12

int square = number * number;
int sum = 0;
while (square &gt; 0) {
sum += square % 10;
square /= 10;
}
return sum == number;
}
public static boolean isSpy(int number) {
int sum = 0, product = 1;
while (number &gt; 0) {
int digit = number % 10;
sum += digit;
product *= digit;
number /= 10;
}
return sum == product;
}
public static boolean isAutomorphic(int number) {
int square = number * number;
String numStr = String.valueOf(number);
String squareStr = String.valueOf(square);
return squareStr.endsWith(numStr);
}
public static boolean isBuzz(int number) {
return number % 7 == 0 || number % 10 == 7;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(&quot;Enter a number: &quot;);
int number = sc.nextInt();
System.out.println(&quot;Is Prime Number? &quot; + isPrime(number));
System.out.println(&quot;Is Neon Number? &quot; + isNeon(number));
System.out.println(&quot;Is Spy Number? &quot; + isSpy(number));
System.out.println(&quot;Is Automorphic Number? &quot; +
isAutomorphic(number));
System.out.println(&quot;Is Buzz Number? &quot; + isBuzz(number));

13

}
}