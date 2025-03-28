import java.util.Scanner;
public class CharacterTypeFinder {
// Method to determine if a character is a Vowel, Consonant, or Not a
Letter
public static String getCharacterType(char ch) {
// Convert uppercase to lowercase using ASCII values
if (ch &gt;= &#39;A&#39; &amp;&amp; ch &lt;= &#39;Z&#39;) {
ch = (char)(ch + 32); // converting to lowercase
}
// Check if it&#39;s a letter
if (ch &gt;= &#39;a&#39; &amp;&amp; ch &lt;= &#39;z&#39;) {
if (ch == &#39;a&#39; || ch == &#39;e&#39; || ch == &#39;i&#39; || ch == &#39;o&#39; || ch ==
&#39;u&#39;) {
return &quot;Vowel&quot;;
} else {
return &quot;Consonant&quot;;
}
} else {
return &quot;Not a Letter&quot;;
}
}
public static String[][] findCharacters(String str) {
int len = str.length();
String[][] result = new String[len][2];
for (int i = 0; i &lt; len; i++) {
char ch = str.charAt(i);
result[i][0] = String.valueOf(ch);
result[i][1] = getCharacterType(ch);
}
return result;
}
// Method to display the 2D array in a tabular format
public static void displayCharacterTable(String[][] data) {
System.out.printf(&quot;%-10s%-20s%n&quot;, &quot;Character&quot;, &quot;Type&quot;);
System.out.println(&quot;----------------------------&quot;);
for (String[] row : data) {
System.out.printf(&quot;%-10s%-20s%n&quot;, row[0], row[1]);
}
}
// Main function
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
// Input
System.out.print(&quot;Enter a string: &quot;);
String input = scanner.nextLine();
// Process
String[][] characterData = findCharacters(input);
// Output
displayCharacterTable(characterData);
scanner.close();
}
}