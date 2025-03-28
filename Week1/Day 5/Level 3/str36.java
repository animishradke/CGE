import java.util.Scanner;

public class str36 {
public static String[] getCharFrequencies(String text) {
char[] characters = text.toCharArray();
int[] frequency = new int[characters.length];
for (int i = 0; i &lt; characters.length; i++) {
frequency[i] = 1;
for (int j = i + 1; j &lt; characters.length; j++) {
if (characters[i] == characters[j] &amp;&amp; characters[i] != &#39;0&#39;)
{
frequency[i]++;
characters[j] = &#39;0&#39;; // mark duplicate as processed
}
}
}
int count = 0;
for (int i = 0; i &lt; characters.length; i++) {
if (characters[i] != &#39;0&#39;) {
count++;
}
}

14

String[] result = new String[count];
int index = 0;
for (int i = 0; i &lt; characters.length; i++) {
if (characters[i] != &#39;0&#39;) {
result[index] = characters[i] + &quot; = &quot; + frequency[i];
index++;
}
}
return result;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a text: &quot;);
String input = scanner.nextLine().replaceAll(&quot;\\s&quot;,
&quot;&quot;).toLowerCase();
String[] freqResult = getCharFrequencies(input);
System.out.println(&quot;\nCharacter Frequencies:&quot;);
for (String entry : freqResult) {
System.out.println(entry);
}
scanner.close();
}
}