public class UniqueCharacters {

public static int getLength(String text) {
int length = 0;
try {
while (true) {
text.charAt(length);
length++;
}
} catch (Exception e) {
// Reached end of string
}
return length;
}
public static char[] findUniqueCharacters(String text) {
int len = getLength(text);
char[] result = new char[len]; // temporary array to hold unique
characters
int uniqueCount = 0;
for (int i = 0; i &lt; len; i++) {
char current = text.charAt(i);
boolean isUnique = true;
for (int j = 0; j &lt; i; j++) {
if (text.charAt(j) == current) {
isUnique = false;
break;
}
}
if (isUnique) {
result[uniqueCount++] = current;
}
}
// Create a new array of exact size for unique characters
char[] uniqueChars = new char[uniqueCount];
for (int i = 0; i &lt; uniqueCount; i++) {
uniqueChars[i] = result[i];
}
return uniqueChars;
}
// Main function
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a text: &quot;);
String input = scanner.nextLine();
char[] uniqueChars = findUniqueCharacters(input);
System.out.print(&quot;Unique characters: &quot;);
for (char c : uniqueChars) {
System.out.print(c + &quot; &quot;);
}
}
}