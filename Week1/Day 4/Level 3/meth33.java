import java.util.*;
public class meth33{
public static int countDigits(int number) {
return String.valueOf(Math.abs(number)).length();
}
public static int[] getDigitsArray(int number) {
String str = String.valueOf(Math.abs(number));
int[] digits = new int[str.length()];
for (int i = 0; i &lt; str.length(); i++) {
digits[i] = str.charAt(i) - &#39;0&#39;;
}
return digits;
}
public static int sumOfDigits(int[] digits) {
int sum = 0;

8

for (int digit : digits)
sum += digit;
return sum;
}
public static int sumOfSquaresOfDigits(int[] digits) {
int sum = 0;
for (int digit : digits)
sum += Math.pow(digit, 2);
return sum;
}
public static boolean isHarshadNumber(int number, int[] digits) {
int sum = sumOfDigits(digits);
return number % sum == 0;
}
public static int[][] digitFrequency(int[] digits) {
int[] freq = new int[10];
for (int digit : digits)
freq[digit]++;
int count = 0;
for (int f : freq)
if (f &gt; 0) count++;
int[][] result = new int[count][2];
int index = 0;
for (int i = 0; i &lt; 10; i++) {
if (freq[i] &gt; 0) {
result[index][0] = i;
result[index][1] = freq[i];
index++;
}
}
return result;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(&quot;Enter a number: &quot;);
int number = sc.nextInt();

9

int[] digits = getDigitsArray(number);
System.out.println(&quot;Count of digits: &quot; + countDigits(number));
System.out.println(&quot;Digits: &quot; + Arrays.toString(digits));
System.out.println(&quot;Sum of digits: &quot; + sumOfDigits(digits));
System.out.println(&quot;Sum of squares of digits: &quot; +
sumOfSquaresOfDigits(digits));
System.out.println(&quot;Is Harshad Number? &quot; + isHarshadNumber(number,
digits));
int[][] freq = digitFrequency(digits);
System.out.println(&quot;Digit Frequency:&quot;);
for (int[] row : freq) {
System.out.println(&quot;Digit: &quot; + row[0] + &quot; -&gt; Frequency: &quot; +
row[1]);
}
}
}