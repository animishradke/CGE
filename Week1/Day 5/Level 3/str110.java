import java.util.Scanner;
public class str110 {
public static String customToLowerCase(String text) {
StringBuilder result = new StringBuilder();
for (int i = 0; i &lt; text.length(); i++) {
char ch = text.charAt(i);
if (ch &gt;= &#39;A&#39; &amp;&amp; ch &lt;= &#39;Z&#39;) {
ch = (char) (ch + 32);
}
result.append(ch);
}
return result.toString();
}
public static boolean compareStrings(String str1, String str2) {
if (str1.length() != str2.length()) {
return false;
}
for (int i = 0; i &lt; str1.length(); i++) {
if (str1.charAt(i) != str2.charAt(i)) {
return false;
}
}
return true;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a complete text: &quot;);
String originalText = scanner.nextLine();
String builtInLower = originalText.toLowerCase();
String customLower = customToLowerCase(originalText);
// Compare the two results
boolean isEqual = compareStrings(builtInLower, customLower);
// Display the result
System.out.println(&quot;Built-in lowercase: &quot; + builtInLower);
System.out.println(&quot;Custom lowercase: &quot; + customLower);
System.out.println(&quot;Are both equal? &quot; + isEqual);
scanner.close();
}
}