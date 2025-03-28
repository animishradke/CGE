Integer.MAX_VALUE to initialize the variable.
import java.util.Scanner;
public class NumberChecker {
// Method to count the number of digits
public static int countDigits(int num) {
return String.valueOf(num).length();
}
// Method to store the digits of the number in an array
public static int[] getDigitsArray(int num) {
String numStr = String.valueOf(num);
int[] digits = new int[numStr.length()];
for (int i = 0; i &lt; numStr.length(); i++) {
digits[i] = Character.getNumericValue(numStr.charAt(i));
}
return digits;
}
// Method to check if the number is a Duck number
public static boolean isDuckNumber(int num) {
String numStr = String.valueOf(num);
return numStr.contains(&quot;0&quot;);
}
// Method to check if the number is an Armstrong number
public static boolean isArmstrong(int num) {
int[] digits = getDigitsArray(num);
int sum = 0;
int power = digits.length;
for (int digit : digits) {
sum += Math.pow(digit, power);
}
return sum == num;
}

6

// Method to find the largest and second largest digit
public static int[] findLargestAndSecondLargest(int[] digits) {
int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
for (int digit : digits) {
if (digit &gt; max1) {
max2 = max1;
max1 = digit;
} else if (digit &gt; max2 &amp;&amp; digit != max1) {
max2 = digit;
}
}
return new int[]{max1, max2};
}
// Method to find the smallest and second smallest digit
public static int[] findSmallestAndSecondSmallest(int[] digits) {
int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
for (int digit : digits) {
if (digit &lt; min1) {
min2 = min1;
min1 = digit;
} else if (digit &lt; min2 &amp;&amp; digit != min1) {
min2 = digit;
}
}
return new int[]{min1, min2};
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a number: &quot;);
int number = scanner.nextInt();
scanner.close();
int[] digits = getDigitsArray(number);
System.out.println(&quot;Number of digits: &quot; + countDigits(number));
System.out.println(&quot;Duck Number: &quot; + isDuckNumber(number));
System.out.println(&quot;Armstrong Number: &quot; + isArmstrong(number));
int[] largestValues = findLargestAndSecondLargest(digits);
System.out.println(&quot;Largest digit: &quot; + largestValues[0] + &quot;, Second
Largest digit: &quot; + largestValues[1]);

7

int[] smallestValues = findSmallestAndSecondSmallest(digits);
System.out.println(&quot;Smallest digit: &quot; + smallestValues[0] + &quot;,
Second Smallest digit: &quot; + smallestValues[1]);
}
}