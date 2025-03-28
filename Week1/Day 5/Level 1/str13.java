import java.util.Scanner;
public class str13 {
toCharArray)
public static char[] getCharacters(String text) {
char[] result = new char[text.length()];
for (int i = 0; i &lt; text.length(); i++) {
result[i] = text.charAt(i);
}
return result;
}
public static boolean compareArrays(char[] a, char[] b) {
if (a.length != b.length) return false;
for (int i = 0; i &lt; a.length; i++) {
if (a[i] != b[i]) return false;
}
return true;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a string: &quot;);
String input = scanner.next();
char[] customArray = getCharacters(input);
char[] builtInArray = input.toCharArray();
boolean isEqual = compareArrays(customArray, builtInArray);
System.out.println(&quot;\nCustom Array: &quot;);
for (char c : customArray) {

7

System.out.print(c + &quot; &quot;);
}
System.out.println(&quot;\nBuilt-in Array: &quot;);
for (char c : builtInArray) {
System.out.print(c + &quot; &quot;);
}
System.out.println(&quot;\n\nAre both arrays equal? &quot; + isEqual);
scanner.close();
}
}