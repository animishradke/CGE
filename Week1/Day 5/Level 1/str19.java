import java.util.Scanner;
public class str19 {
public static String customToUpperCase(String text) {
StringBuilder result = new StringBuilder();
for (int i = 0; i &lt; text.length(); i++) {
char ch = text.charAt(i);
if (ch &gt;= &#39;a&#39; &amp;&amp; ch &lt;= &#39;z&#39;) {
ch = (char) (ch - 32);
}
result.append(ch);
}
return result.toString();
}
public static boolean compareStrings(String str1, String str2) {
if (str1.length() != str2.length()) {

14

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
String builtInUpper = originalText.toUpperCase();
String customUpper = customToUpperCase(originalText);
boolean isEqual = compareStrings(builtInUpper, customUpper);
System.out.println(&quot;\nBuilt-in uppercase: &quot; + builtInUpper);
System.out.println(&quot;Custom uppercase: &quot; + customUpper);
System.out.println(&quot;Are both equal? &quot; + isEqual);
scanner.close();
}
}