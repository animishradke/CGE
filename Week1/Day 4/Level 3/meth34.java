import java.util.*;
public class meth34 {
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
public static int[] reverseDigitsArray(int[] digits) {
int[] reversed = new int[digits.length];
for (int i = 0; i &lt; digits.length; i++) {
reversed[i] = digits[digits.length - 1 - i];
}
return reversed;
}
public static boolean areArraysEqual(int[] arr1, int[] arr2) {
if (arr1.length != arr2.length)
return false;
for (int i = 0; i &lt; arr1.length; i++)
if (arr1[i] != arr2[i])
return false;
return true;
}
public static boolean isPalindrome(int[] digits) {
int[] reversed = reverseDigitsArray(digits);
return areArraysEqual(digits, reversed);
}
public static boolean isDuckNumber(int[] digits) {
for (int i = 1; i &lt; digits.length; i++) {
if (digits[i] == 0)
return true;
}
return false;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print(&quot;Enter a number: &quot;);
int number = sc.nextInt();

11

int[] digits = getDigitsArray(number);
System.out.println(&quot;Count of digits: &quot; + countDigits(number));
System.out.println(&quot;Digits: &quot; + Arrays.toString(digits));
System.out.println(&quot;Reversed Digits: &quot; +
Arrays.toString(reverseDigitsArray(digits)));
System.out.println(&quot;Is Palindrome Number? &quot; +
isPalindrome(digits));
System.out.println(&quot;Is Duck Number? &quot; + isDuckNumber(digits));
}
}