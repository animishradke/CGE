import java.util.Scanner;
public class arr23 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a number: &quot;);
int number = scanner.nextInt();
int maxDigit = 10;
int[] digits = new int[maxDigit];
int index = 0;
while (number &gt; 0 &amp;&amp; index &lt; maxDigit) {
digits[index++] = number % 10;
number /= 10;
}
int largest = Integer.MIN_VALUE;
int secondLargest = Integer.MIN_VALUE;
for (int i = 0; i &lt; index; i++) {
if (digits[i] &gt; largest) {
secondLargest = largest;
largest = digits[i];
} else if (digits[i] &gt; secondLargest &amp;&amp; digits[i] != largest) {
secondLargest = digits[i];
}
}
System.out.println(&quot;Largest digit: &quot; + largest);
System.out.println(&quot;Second largest digit: &quot; + secondLargest);
}
}