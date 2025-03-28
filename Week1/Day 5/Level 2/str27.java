import java.util.Scanner;
public class str27 {
public static int[] findTrimIndices(String str) {
int start = 0;
int end = str.length() - 1;
while (start &lt; str.length() &amp;&amp; str.charAt(start) == &#39; &#39;) {
start++;
}
while (end &gt;= 0 &amp;&amp; str.charAt(end) == &#39; &#39;) {
end--;
}
return new int[]{start, end};
}
public static String customSubstring(String str, int start, int end) {
String result = &quot;&quot;;
for (int i = start; i &lt;= end; i++) {
result += str.charAt(i);
}
return result;
}

17

public static boolean compareStrings(String str1, String str2) {
if (str1.length() != str2.length()) return false;
for (int i = 0; i &lt; str1.length(); i++) {
if (str1.charAt(i) != str2.charAt(i)) return false;
}
return true;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String input = sc.nextLine();
int[] indices = findTrimIndices(input);
String trimmedCustom = (indices[0] &lt;= indices[1]) ?
customSubstring(input, indices[0], indices[1]) : &quot;&quot;;
String trimmedBuiltIn = input.trim();
boolean isSame = compareStrings(trimmedCustom, trimmedBuiltIn);
System.out.println(&quot;Custom Trimmed: &#39;&quot; + trimmedCustom + &quot;&#39;&quot;);
System.out.println(&quot;Built-in Trimmed: &#39;&quot; + trimmedBuiltIn + &quot;&#39;&quot;);
System.out.println(&quot;Are both equal? &quot; + isSame);
sc.close();
}
}