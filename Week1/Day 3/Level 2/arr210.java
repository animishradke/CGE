import java.util.Scanner;

public class arr210 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

17

System.out.print(&quot;Enter a number: &quot;);
int number = scanner.nextInt();

int[] frequency = new int[10];
int temp = number;

while (temp &gt; 0) {
int digit = temp % 10;
frequency[digit]++;
temp /= 10;
}

System.out.println(&quot;Digit frequencies in &quot; + number + &quot;:&quot;);
for (int i = 0; i &lt; 10; i++) {
if (frequency[i] &gt; 0) {
System.out.println(&quot;Digit &quot; + i + &quot; appears &quot; + frequency[i] + &quot; times&quot;);
}
}
}
}