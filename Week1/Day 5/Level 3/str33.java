import java.util.Scanner;
public class str33 {
public static char findFirstNonRepeatingChar(String text) {
int[] frequency = new int[256]; 
for (int i = 0; i &lt; text.length(); i++) {

char ch = text.charAt(i);
frequency[ch]++;
}
for (int i = 0; i &lt; text.length(); i++) {
char ch = text.charAt(i);
if (frequency[ch] == 1) {
return ch;
}
}
return &#39;\0&#39;
found
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a string: &quot;);
String input = scanner.nextLine().replaceAll(&quot;\\s&quot;,
&quot;&quot;).toLowerCase();
char result = findFirstNonRepeatingChar(input);
if (result != &#39;\0&#39;) {
System.out.println(&quot;First non-repeating character: &quot; + result);
} else {
System.out.println(&quot;No non-repeating character found.&quot;);
}
scanner.close();
}
}