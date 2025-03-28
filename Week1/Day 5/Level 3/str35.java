import java.util.Scanner;
public class str35 {
// Method to find unique characters using charAt() and nested loops
public static char[] uniqueCharacters(String text) {
StringBuilder unique = new StringBuilder();
for (int i = 0; i &lt; text.length(); i++) {
char ch = text.charAt(i);
boolean isUnique = true;
for (int j = 0; j &lt; i; j++) {
if (text.charAt(j) == ch) {
isUnique = false;
break;
}
}
if (isUnique) {
unique.append(ch);
}
}
return unique.toString().toCharArray();
}
// Method to calculate frequency using ASCII array and return 2D array
public static String[][] getFrequencies(String text) {
int[] freq = new int[256];
// Count frequency of each character
for (int i = 0; i &lt; text.length(); i++) {
freq[text.charAt(i)]++;
}
// Get unique characters
char[] uniqueChars = uniqueCharacters(text);

12

// Build 2D array
String[][] result = new String[uniqueChars.length][2];
for (int i = 0; i &lt; uniqueChars.length; i++) {
result[i][0] = Character.toString(uniqueChars[i]);
result[i][1] = Integer.toString(freq[uniqueChars[i]]);
}
return result;
}
// Method to display the 2D array
public static void displayFrequencies(String[][] data) {
System.out.printf(&quot;%-10s%-10s\n&quot;, &quot;Character&quot;, &quot;Frequency&quot;);
System.out.println(&quot;----------------------&quot;);
for (String[] row : data) {
System.out.printf(&quot;%-10s%-10s\n&quot;, row[0], row[1]);
}
}
// Main method
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a string: &quot;);
String input = scanner.nextLine().replaceAll(&quot;\\s&quot;,
&quot;&quot;).toLowerCase();
String[][] result = getFrequencies(input);
System.out.println(&quot;\nFrequency of Unique Characters:&quot;);
displayFrequencies(result);
scanner.close();
}
}