import java.util.Scanner;
public class NumberChecker {
public static int[] getFactors(int number) {
int count = 0;
for (int i = 1; i &lt;= number; i++)
if (number % i == 0)
count++;
int[] factors = new int[count];
int index = 0;
for (int i = 1; i &lt;= number; i++)
if (number % i == 0)
factors[index++] = i;
return factors;
}

14

public static int greatestFactor(int[] factors, int number) {
int max = 1;
for (int factor : factors) {
if (factor &lt; number &amp;&amp; factor &gt; max)
max = factor;
}
return max;
}
public static int sumOfFactors(int[] factors) {
int sum = 0;
for (int factor : factors)
sum += factor;
return sum;
}
public static int productOfFactors(int[] factors) {
int product = 1;
for (int factor : factors)
product *= factor;
return product;
}
public static double productOfCubeOfFactors(int[] factors) {
double product = 1;
for (int factor : factors)
product *= Math.pow(factor, 3);
return product;
}
public static boolean isPerfectNumber(int number, int[] factors) {
int sum = 0;
for (int factor : factors) {
if (factor != number)
sum += factor;
}
return sum == number;
}
public static boolean isAbundantNumber(int number, int[] factors) {
int sum = 0;
for (int factor : factors) {

15

if (factor != number)
sum += factor;
}
return sum &gt; number;
}
public static boolean isDeficientNumber(int number, int[] factors) {
int sum = 0;
for (int factor : factors) {
if (factor != number)
sum += factor;
}
return sum &lt; number;
}
public static boolean isStrongNumber(int number) {
int sum = 0, temp = number;
while (temp &gt; 0) {
int digit = temp % 10;
sum += factorial(digit);
temp /= 10;
}
return sum == number;
}
public static int factorial(int n) {
int fact = 1;
for (int i = 2; i &lt;= n; i++)
fact *= i;
return fact;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(&quot;Enter a number: &quot;);
int number = sc.nextInt();
int[] factors = getFactors(number);
System.out.print(&quot;Factors: &quot;);
for (int factor : factors)
System.out.print(factor + &quot; &quot;);

16

System.out.println();
System.out.println(&quot;Greatest Factor (excluding number itself): &quot; +
greatestFactor(factors, number));
System.out.println(&quot;Sum of Factors: &quot; + sumOfFactors(factors));
System.out.println(&quot;Product of Factors: &quot; +
productOfFactors(factors));
System.out.println(&quot;Product of Cubes of Factors: &quot; +
productOfCubeOfFactors(factors));
System.out.println(&quot;Is Perfect Number? &quot; + isPerfectNumber(number,
factors));
System.out.println(&quot;Is Abundant Number? &quot; +
isAbundantNumber(number, factors));
System.out.println(&quot;Is Deficient Number? &quot; +
isDeficientNumber(number, factors));
System.out.println(&quot;Is Strong Number? &quot; + isStrongNumber(number));
}